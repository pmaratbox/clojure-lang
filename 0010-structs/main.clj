(defrecord Person [name age])

(let [p (->Person "Ada" 36)]
  (println "name:" (:name p))
  (println "age:" (:age p)))
