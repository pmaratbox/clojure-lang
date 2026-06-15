(require '[cheshire.core :as json])

;; The in-code field is `fullName`, but the JSON key must be `full_name`.
;; Cheshire honours whatever key we put in the map, so we rename the field by
;; emitting it under the desired JSON key via a custom key-fn that maps the
;; idiomatic Clojure key :full-name to the wire name "full_name".
(def person {:full-name "alice"})

(def renamed
  (json/generate-string person
                        {:key-fn (fn [k]
                                   (clojure.string/replace (name k) "-" "_"))}))

(println renamed)
