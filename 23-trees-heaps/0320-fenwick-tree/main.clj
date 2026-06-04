(def data [1 2 3 4 5])
(def n (count data))

(defn update-bit [bit i delta] ; 1-based index
  (loop [bit bit i i]
    (if (> i n)
      bit
      (recur (assoc bit i (+ (bit i) delta))
             (+ i (bit-and i (- i)))))))

(defn build []
  (reduce (fn [bit idx]
            (update-bit bit (inc idx) (data idx)))
          (vec (repeat (inc n) 0))
          (range n)))

(defn prefix-sum [bit i] ; sum of first i elements
  (loop [i i s 0]
    (if (zero? i)
      s
      (recur (- i (bit-and i (- i))) (+ s (bit i))))))

(def bit (build))

(println (prefix-sum bit 4))
