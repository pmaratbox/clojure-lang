(defn add [a b] (+ a b))

(def add10 (partial add 10))

(println (add10 3))
