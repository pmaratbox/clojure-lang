(defn permutations [coll]
  (if (empty? coll)
    [[]]
    (for [x (sort coll)
          p (permutations (remove #(= % x) coll))]
      (cons x p))))

(doseq [p (permutations [1 2 3])]
  (println (clojure.string/join " " p)))
