(defn quickselect [coll k]
  (let [pivot (first coll)
        rest* (rest coll)
        smaller (filter #(< % pivot) rest*)
        larger (filter #(>= % pivot) rest*)
        n (count smaller)]
    (cond
      (= k n) pivot
      (< k n) (recur smaller k)
      :else   (recur larger (- k n 1)))))

(println (quickselect [7 10 4 3 20 15] 2))
