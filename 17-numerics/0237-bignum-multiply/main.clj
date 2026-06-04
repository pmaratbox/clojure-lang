(defn digits [s] (mapv #(- (int %) 48) s))

(defn mul-strings [a b]
  (let [da (digits a)
        db (digits b)
        n (count da)
        m (count db)
        res (long-array (+ n m))]
    (doseq [i (range (dec n) -1 -1)
            j (range (dec m) -1 -1)]
      (let [p (* (nth da i) (nth db j))
            pos (+ i j 1)
            sum (+ p (aget res pos))]
        (aset res pos (rem sum 10))
        (aset res (dec pos) (+ (aget res (dec pos)) (quot sum 10)))))
    (let [ds (drop-while zero? (vec res))
          ds (if (empty? ds) [0] ds)]
      (apply str (map #(char (+ 48 %)) ds)))))

(println (mul-strings "123" "456"))
