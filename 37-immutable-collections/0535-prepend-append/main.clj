;; Clojure's persistent vector is immutable: every update returns a NEW
;; collection while the original is left unchanged (structural sharing).
(def original [2 3])

;; Append to the tail with conj -> new vector.
(def appended (conj original 4))

;; Prepend to the head with into onto a single-element vector -> new vector.
(def final-coll (into [1] appended))

;; original is still [2 3] here; prepend/append never mutated it.
(assert (= original [2 3]))

;; Print the fully built final list, space-joined.
(println (clojure.string/join " " final-coll))
