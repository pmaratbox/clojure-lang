(defn shell-sort [coll]
  (loop [v (vec coll)
         gap (quot (count v) 2)]
    (if (zero? gap)
      v
      (recur
        (reduce
          (fn [v i]
            (let [x (v i)]
              (loop [v v j i]
                (if (and (>= j gap) (> (v (- j gap)) x))
                  (recur (assoc v j (v (- j gap))) (- j gap))
                  (assoc v j x)))))
          v (range gap (count v)))
        (quot gap 2)))))

(println (apply str (interpose " " (shell-sort [5 2 8 1 9 3]))))
