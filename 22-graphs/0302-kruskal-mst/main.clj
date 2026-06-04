(def edges [[0 1 1] [1 2 2] [0 2 3]])

(defn find-root [parent x]
  (if (= (parent x) x) x (recur parent (parent x))))

(defn kruskal []
  (loop [parent {0 0 1 1 2 2}
         total 0
         es (sort-by #(nth % 2) edges)]
    (if (empty? es)
      total
      (let [[u v w] (first es)
            ru (find-root parent u)
            rv (find-root parent v)]
        (if (= ru rv)
          (recur parent total (rest es))
          (recur (assoc parent ru rv) (+ total w) (rest es)))))))

(println (kruskal))
