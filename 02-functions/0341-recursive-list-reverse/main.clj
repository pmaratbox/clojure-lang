(defn rrev [coll]
  (if (empty? coll)
    []
    (conj (rrev (rest coll)) (first coll))))

(println (apply str (interpose " " (rrev [1 2 3]))))
