(def a [1 3 5])
(def b [2 4 6])

(println (apply str (interpose " " (interleave a b))))
