(def nums [1 2 3 4 5])

(def result (->> nums
                 (filter even?)
                 (map #(* 2 %))
                 (reduce +)))

(println (str "sum: " result))
