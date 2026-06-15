(require '[cheshire.core :as json])

(def person (array-map :age 30 :name "alice"))

(def encoded (json/generate-string person))

(def decoded (json/parse-string encoded true))

(println (:name decoded))
