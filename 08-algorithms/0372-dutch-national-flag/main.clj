(defn dutch-flag [coll]
  (loop [v (vec coll) low 0 mid 0 high (dec (count coll))]
    (if (> mid high)
      v
      (let [x (v mid)]
        (cond
          (= x 0) (recur (assoc v low (v mid) mid (v low)) (inc low) (inc mid) high)
          (= x 2) (recur (assoc v high (v mid) mid (v high)) low mid (dec high))
          :else   (recur v low (inc mid) high))))))

(println (apply str (interpose " " (dutch-flag [2 0 2 1 1 0]))))
