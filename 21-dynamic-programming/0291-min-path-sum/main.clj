(def grid [[1 3 1] [1 5 1] [4 2 1]])
(def rows (count grid))
(def cols (count (first grid)))

(def dp
  (reduce
   (fn [dp [i j]]
     (let [cell ((grid i) j)
           up   (if (pos? i) ((dp (dec i)) j) Long/MAX_VALUE)
           left (if (pos? j) ((dp i) (dec j)) Long/MAX_VALUE)
           best (cond
                  (and (zero? i) (zero? j)) cell
                  :else (+ cell (min up left)))]
       (assoc-in dp [i j] best)))
   (vec (repeat rows (vec (repeat cols 0))))
   (for [i (range rows) j (range cols)] [i j])))

(println ((dp (dec rows)) (dec cols)))
