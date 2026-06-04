(def adj {0 [[1 1]] 1 [[0 1] [2 2]] 2 [[1 2] [3 3]] 3 [[2 3]]})
(def n 4)

(defn prim []
  (loop [in-tree #{0} total 0]
    (if (= (count in-tree) n)
      total
      (let [crossing (for [u in-tree
                           [v w] (adj u)
                           :when (not (in-tree v))]
                       [w v])
            [w v] (apply min-key first crossing)]
        (recur (conj in-tree v) (+ total w))))))

(println (prim))
