(defrecord Address [city])
(defrecord Person [name address])

(let [person (->Person "Ada" (->Address "London"))]
  (println (:city (:address person))))
