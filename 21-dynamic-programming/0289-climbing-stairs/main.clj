(def n 5)

(def ways
  (reduce
   (fn [dp i]
     (assoc dp i (+ (dp (- i 1)) (dp (- i 2)))))
   (assoc (vec (repeat (inc n) 0)) 0 1 1 1)
   (range 2 (inc n))))

(println (ways n))
