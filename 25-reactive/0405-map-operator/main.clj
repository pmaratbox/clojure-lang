;; A push-based Observable implemented from scratch.
;; An observer is a map of callbacks; subscribe wires a producer to it.
;; map-op returns a new Observable whose next forwards (f value).

(defn observable
  "Wrap a producer fn that receives an observer and emits to it."
  [producer]
  {:subscribe producer})

(defn subscribe [obs observer]
  ((:subscribe obs) observer))

(defn map-op
  "Return a new Observable transforming each emitted value with f."
  [source f]
  (observable
    (fn [observer]
      (subscribe source
                 {:next     (fn [v] ((:next observer) (f v)))
                  :error    (:error observer)
                  :complete (:complete observer)}))))

;; Source emits 1,2,3,4 synchronously.
(def source
  (observable
    (fn [observer]
      (doseq [v [1 2 3 4]]
        ((:next observer) v))
      (when-let [c (:complete observer)] (c)))))

(def doubled (map-op source #(* % 2)))

(subscribe doubled
           {:next     (fn [v] (println v))
            :error    (fn [e] (println "error" e))
            :complete (fn [] nil)})
