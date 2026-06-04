(def xs [1 2 3 4])

(def pairs
  (for [[a b] (partition 2 1 xs)]
    (str a "," b)))

(println (apply str (interpose " " pairs)))
