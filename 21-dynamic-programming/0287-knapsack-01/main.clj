(def items [[2 3] [3 4] [4 5]])
(def cap 5)

(def dp
  (reduce
   (fn [dp [w v]]
     (reduce
      (fn [dp c]
        (assoc dp c (max (dp c) (+ v (dp (- c w))))))
      dp
      (range cap (dec w) -1)))
   (vec (repeat (inc cap) 0))
   items))

(println (dp cap))
