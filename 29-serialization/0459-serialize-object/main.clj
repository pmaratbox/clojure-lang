(require '[cheshire.core :as json])

;; A "Person" object modelled as a map with keys in alphabetical order
;; (age before name) so the serialized JSON keys come out alphabetical.
(def person (array-map :age 30 :name "alice"))

;; Serialize the object to a compact JSON string via Cheshire.
(println (json/generate-string person))
