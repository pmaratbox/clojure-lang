(def table [[1000 "M"] [900 "CM"] [500 "D"] [400 "CD"]
            [100 "C"] [90 "XC"] [50 "L"] [40 "XL"]
            [10 "X"] [9 "IX"] [5 "V"] [4 "IV"] [1 "I"]])

(defn int->roman [n]
  (loop [n n acc ""]
    (if (zero? n)
      acc
      (let [[v sym] (first (filter (fn [[v _]] (<= v n)) table))]
        (recur (- n v) (str acc sym))))))

(println (int->roman 14))
