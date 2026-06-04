(def xs [1 2 3 4])
(def ys #{2 4})

(println (apply str (interpose " " (remove ys xs))))
