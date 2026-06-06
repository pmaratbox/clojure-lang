;; A push-based Observable implemented from scratch.
;; An observer is a map of :next/:error/:complete closures.
;; subscribe returns an unsubscribe fn; the producer checks an
;; "active" atom so an unbounded source stops once unsubscribed.

(defn observable
  "Wrap a producer fn that receives an observer and returns unsubscribe."
  [producer]
  {:subscribe producer})

(defn subscribe [obs observer]
  ((:subscribe obs) observer))

(defn take-op
  "Emit the first n values from source, then complete and unsubscribe it."
  [source n]
  (observable
    (fn [observer]
      (let [count (atom 0)
            unsub (atom nil)]
        (reset! unsub
          (subscribe source
            {:next     (fn [v]
                         (when (< @count n)
                           (swap! count inc)
                           ((:next observer) v)
                           (when (>= @count n)
                             (when-let [c (:complete observer)] (c))
                             (when-let [u @unsub] (u)))))
             :error    (:error observer)
             :complete (:complete observer)}))
        @unsub))))

;; Unbounded source of the natural numbers 1,2,3,4,...
;; Driven by a loop that stops once the active atom is cleared.
(def naturals
  (observable
    (fn [observer]
      (let [active (atom true)]
        (loop [i 1]
          (when @active
            ((:next observer) i)
            (recur (inc i))))
        (fn [] (reset! active false))))))

(def first-three (take-op naturals 3))

(subscribe first-three
           {:next     (fn [v] (println v))
            :error    (fn [e] (println "error" e))
            :complete (fn [] (println "completed"))})
