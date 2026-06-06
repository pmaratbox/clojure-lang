;; A push-based Observable implemented from scratch.
;; An observer is a map of {:next :error :complete} functions.
;; subscribe wires a producer to an observer.

(defn observable
  "Wrap a producer function (fn [observer]) as an observable."
  [producer]
  {:subscribe producer})

(defn subscribe [obs observer]
  ((:subscribe obs) observer))

(defn from-seq
  "Synchronously emit each value of xs, then complete."
  [xs]
  (observable
    (fn [observer]
      (doseq [x xs]
        ((:next observer) x))
      ((:complete observer)))))

(defn scan
  "Emit the running accumulation: state seeded with acc, state=(f state value), emit state."
  [source acc f]
  (observable
    (fn [observer]
      (let [state (atom acc)]
        (subscribe source
          {:next     (fn [v]
                       (swap! state f v)
                       ((:next observer) @state))
           :error    (:error observer)
           :complete (:complete observer)})))))

(subscribe
  (scan (from-seq [1 2 3 4]) 0 +)
  {:next     (fn [v] (println v))
   :error    (fn [e] (println "error" e))
   :complete (fn [] nil)})
