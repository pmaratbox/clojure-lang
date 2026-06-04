(def sum-of-squares (comp (partial reduce +) (partial map #(* % %))))

(println (sum-of-squares [1 2 3]))
