(defn selection-sort [v]
  (loop [v (vec v) i 0]
    (if (< i (dec (count v)))
      (let [min-idx (reduce (fn [m j] (if (< (v j) (v m)) j m))
                            i (range (inc i) (count v)))]
        (recur (assoc v i (v min-idx) min-idx (v i)) (inc i)))
      v)))

(println (apply str (interpose " " (selection-sort [5 1 4 2]))))
