(def xs [1 2 3 4 1])

(println (apply str (interpose " " (take-while #(< % 3) xs))))
