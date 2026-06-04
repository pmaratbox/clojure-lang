(defn add [a]
  (fn [b] (+ a b)))

(println ((add 2) 3))
