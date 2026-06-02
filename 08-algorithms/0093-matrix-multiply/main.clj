(def a [[1 2] [3 4]])
(def b [[5 6] [7 8]])
(def n 2)
(def result
  (for [i (range n)]
    (for [j (range n)]
      (reduce + (for [k (range n)] (* (get-in a [i k]) (get-in b [k j])))))))

(doseq [row result]
  (println (clojure.string/join " " row)))
