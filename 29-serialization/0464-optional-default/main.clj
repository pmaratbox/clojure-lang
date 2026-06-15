(require '[cheshire.core :as json])

;; The JSON has no "age" field; supply a default of 0 when it is absent.
(let [parsed (json/parse-string "{\"name\":\"alice\"}" true)
      name   (:name parsed)
      age    (get parsed :age 0)]
  (println name age))
