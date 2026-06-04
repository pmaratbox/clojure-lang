(def xs [2 4 6])

(def all-even (if (every? even? xs) "yes" "no"))
(def any-odd (if (some odd? xs) "yes" "no"))

(println (str all-even " " any-odd))
