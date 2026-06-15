(require '[clojure.string :as str])

;; Clojure vectors are persistent (immutable) collections.
;; conj returns a NEW collection with 4 appended; the original is unchanged.
(def original [1 2 3])
(def added (conj original 4))

(println (str/join " " added))
(println (str/join " " original))
