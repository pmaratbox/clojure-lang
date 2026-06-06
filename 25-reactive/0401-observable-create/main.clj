(defn observable-create [subscribe]
  subscribe)

(defn observable-123 [observer]
  ((:next observer) 1)
  ((:next observer) 2)
  ((:next observer) 3)
  ((:complete observer)))

(def source (observable-create observable-123))

(source {:next     (fn [x] (println x))
         :complete (fn [] (println "done"))})
