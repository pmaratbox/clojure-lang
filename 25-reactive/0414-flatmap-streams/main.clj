;; FlatMap (mergeMap) over a from-scratch push Observable with a virtual-time scheduler.

;; --- Virtual-time scheduler ---------------------------------------------------
;; State: a vector of [time seq cb], a clock, and a monotonically increasing seq.
(def scheduler (atom {:queue [] :clock 0 :seq 0}))

(defn schedule [t cb]
  (swap! scheduler
         (fn [s]
           (-> s
               (update :queue conj [t (:seq s) cb])
               (update :seq inc)))))

(defn run []
  (loop []
    (let [{:keys [queue]} @scheduler]
      (when (seq queue)
        (let [[t _ cb :as ev] (first (sort-by (juxt first second) queue))]
          (swap! scheduler
                 (fn [s]
                   (-> s
                       (assoc :clock t)
                       (update :queue (fn [q] (vec (remove #(= % ev) q)))))))
          (cb)
          (recur))))))

(defn now [] (:clock @scheduler))

;; --- Observable ---------------------------------------------------------------
;; An observable is a function taking an observer {:next :complete}.
(defn observable [producer] producer)

(defn subscribe [obs observer] (obs observer))

;; A source that emits [time value] pairs by scheduling them at virtual times.
(defn timed-source [events]
  (observable
    (fn [observer]
      (doseq [[t v] events]
        (schedule t (fn [] ((:next observer) v)))))))

;; flatMap: map each outer value to an inner observable and merge all inners.
(defn flat-map [obs f]
  (observable
    (fn [observer]
      (subscribe obs
        {:next (fn [v]
                 (subscribe (f v)
                   {:next (:next observer)
                    :complete (fn [])}))
         :complete (fn [])}))))

;; --- Lesson -------------------------------------------------------------------
(def outer (timed-source [[10 1] [20 2]]))

(defn inner-for [n]
  (let [start (now)]
    (timed-source [[(+ start 5) n] [(+ start 30) (* n 10)]])))

(subscribe (flat-map outer inner-for)
           {:next (fn [v] (println v))
            :complete (fn [])})

(run)
