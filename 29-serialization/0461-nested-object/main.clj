(require '[cheshire.core :as json])

;; Person holds a nested Address. Keys are declared alphabetically
;; (address before name; city before zip) so the compact JSON output
;; has alphabetically ordered keys.
(def address (array-map :city "oslo" :zip 1000))
(def person (array-map :address address :name "alice"))

(println (json/generate-string person))
