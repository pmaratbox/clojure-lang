(require '[cheshire.core :as json])

;; Build the map with keys in alphabetical order so the serialized
;; JSON has alphabetical keys: active, count, label.
(def value (array-map :active true :count 5 :label "x"))

;; Serialize to compact JSON with Cheshire.
(def encoded (json/generate-string value))

(println encoded)
