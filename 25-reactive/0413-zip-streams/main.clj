;; Zip Streams: pair values by index from two push-based sources and combine them.
;; A push-based Observable is implemented from scratch: an observer is a map of
;; :next/:error/:complete callbacks, and subscribe wires a producer to it.

(defn observable
  "Wrap a producer fn (which receives an observer) as a subscribable source."
  [producer]
  (fn [observer] (producer observer)))

(defn from-seq
  "An Observable that synchronously emits each value of coll, then completes."
  [coll]
  (observable
    (fn [observer]
      (doseq [x coll] ((:next observer) x))
      ((:complete observer)))))

(defn zip
  "Pair values by index from sources a and b, emitting (combine x y) for each
   matching pair. Each source buffers into its own queue (an atom holding a
   vector); whenever both queues are non-empty, dequeue one from each and emit."
  [a b combine]
  (observable
    (fn [observer]
      (let [qa (atom [])
            qb (atom [])
            pump (fn []
                   (while (and (seq @qa) (seq @qb))
                     (let [x (first @qa)
                           y (first @qb)]
                       (swap! qa subvec 1)
                       (swap! qb subvec 1)
                       ((:next observer) (combine x y)))))]
        (a {:next     (fn [x] (swap! qa conj x) (pump))
            :error    (:error observer)
            :complete (fn [])})
        (b {:next     (fn [y] (swap! qb conj y) (pump))
            :error    (:error observer)
            :complete (fn [])})
        ((:complete observer))))))

(def source-a (from-seq [1 2 3]))
(def source-b (from-seq [10 20 30]))

((zip source-a source-b +)
 {:next     (fn [v] (println v))
  :error    (fn [e] (println "error" e))
  :complete (fn [])})
