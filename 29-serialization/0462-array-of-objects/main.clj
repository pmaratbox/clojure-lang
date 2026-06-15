(require '[cheshire.core :as json])

;; Each person is an array-map with keys declared in alphabetical order
;; (age before name) so Cheshire emits compact JSON with alphabetical keys.
(def people
  [(array-map :age 30 :name "alice")
   (array-map :age 25 :name "bob")])

(println (json/generate-string people))
