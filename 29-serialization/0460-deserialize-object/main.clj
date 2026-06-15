(require '[cheshire.core :as json])

;; Parse the JSON object into a Person-shaped map (keyword keys).
(def person (json/parse-string "{\"age\":30,\"name\":\"alice\"}" true))

(println (:name person) (:age person))
