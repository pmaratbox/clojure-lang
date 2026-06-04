(def a [1 2 3])
(def b ["a" "b"])

(def n (max (count a) (count b)))

(def pairs
  (for [i (range n)]
    (str (nth a i "-") (nth b i "-"))))

(println (apply str (interpose " " pairs)))
