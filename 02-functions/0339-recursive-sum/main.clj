(defn rsum [coll]
  (if (empty? coll)
    0
    (+ (first coll) (rsum (rest coll)))))

(println (rsum [1 2 3 4]))
