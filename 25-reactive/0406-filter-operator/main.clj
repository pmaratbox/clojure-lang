;; A push-based Observable implemented from scratch.
;; An observer is a map of callbacks {:next :error :complete}.
;; subscribe wires a producer to the observer.

(defn observable
  "Create an Observable from a producer fn that pushes to an observer."
  [producer]
  (fn [observer] (producer observer)))

(defn subscribe [obs observer] (obs observer))

(defn from-seq
  "Emit each value of xs, then complete."
  [xs]
  (observable
    (fn [observer]
      (doseq [x xs] ((:next observer) x))
      ((:complete observer)))))

(defn filter-op
  "Forward a value only when (pred value) is true."
  [source pred]
  (observable
    (fn [observer]
      (subscribe source
        {:next     (fn [x] (when (pred x) ((:next observer) x)))
         :error    (:error observer)
         :complete (:complete observer)}))))

(subscribe
  (filter-op (from-seq [1 2 3 4 5 6]) even?)
  {:next     println
   :error    (fn [e] (println "error" e))
   :complete (fn [] nil)})
