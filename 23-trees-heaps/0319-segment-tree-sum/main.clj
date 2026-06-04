(def data [1 2 3 4 5])
(def n (count data))

;; Iterative segment tree stored in a 2n vector.
(def tree
  (let [base (vec (concat (repeat n 0) data))]
    (loop [t base i (dec n)]
      (if (zero? i)
        t
        (recur (assoc t i (+ (t (* 2 i)) (t (inc (* 2 i))))) (dec i))))))

(defn range-sum [l r] ; inclusive [l r] over original indices
  (loop [l (+ l n) r (+ r n 1) s 0]
    (if (>= l r)
      s
      (let [[l s] (if (odd? l) [(inc l) (+ s (tree l))] [l s])
            [r s] (if (odd? r) [(dec r) (+ s (tree (dec r)))] [r s])]
        (recur (quot l 2) (quot r 2) s)))))

(println (range-sum 1 3))
