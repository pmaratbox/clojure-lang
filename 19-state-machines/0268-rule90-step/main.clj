(def row (mapv #(- (int %) (int \0)) "00100"))

(defn cell [i] (if (<= 0 i (dec (count row))) (row i) 0))

(println (apply str (for [i (range (count row))]
                      (bit-xor (cell (dec i)) (cell (inc i))))))
