;; switchMap on a from-scratch push Observable driven by a virtual-time scheduler.

;; Virtual-time scheduler: a priority queue of [time seq callback], cancellable.
(def clock (atom 0))
(def seq-counter (atom 0))
(def queue (atom []))          ; vector of {:time :seq :cb :alive}
(def cancelled (atom #{}))

(defn schedule [t cb]
  (let [token (swap! seq-counter inc)]
    (swap! queue conj {:time t :seq token :cb cb})
    token))

(defn cancel [token]
  (swap! cancelled conj token))

(defn run []
  (loop []
    (when (seq @queue)
      (let [sorted (sort-by (juxt :time :seq) @queue)
            ev (first sorted)]
        (swap! queue (fn [q] (remove #(= % ev) q)))
        (when-not (contains? @cancelled (:seq ev))
          (reset! clock (:time ev))
          ((:cb ev) (:time ev)))
        (recur)))))

;; A source emits values at given virtual times. Each subscription returns the
;; set of schedule tokens so it can be cancelled.
(defn make-source [events]
  (fn [observer]
    (mapv (fn [[t v]]
            (schedule t (fn [_] (observer v))))
          events)))

;; inner(n): emits (now+5 -> n), (now+30 -> n*10)
(defn inner-source [n]
  (let [now @clock]
    (make-source [[(+ now 5) n] [(+ now 30) (* n 10)]])))

;; switchMap: on each new outer value, cancel the previous inner's pending
;; emissions before subscribing to the new inner.
(defn switch-map [outer project observer]
  (let [current (atom nil)]
    (outer (fn [v]
             (when-let [tokens @current]
               (doseq [tk tokens] (cancel tk)))
             (reset! current ((project v) observer))))))

(def outer (make-source [[10 1] [20 2]]))

(switch-map outer inner-source (fn [v] (println v)))

(run)
