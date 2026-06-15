(require '[clojure.string :as str])

;; Clojure vectors are persistent (immutable) collections.
;; assoc returns a NEW vector with index 0 set to 99; the original is unchanged.
(def original [1 2 3])
(def updated (assoc original 0 99))

(println (str/join " " updated))
(println (str/join " " original))
