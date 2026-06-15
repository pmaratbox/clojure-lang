(require '[clojure.string :as str])

;; Clojure vectors are persistent (immutable) collections.
;; filter and map return NEW lazy sequences; the original vector is untouched.
(def nums [1 2 3 4 5])

(def evens (filter even? nums))   ; new seq, original unchanged
(def result (map #(* % 10) evens)) ; new seq, original unchanged

(println (str/join " " result))
