(def rows 3)
(def cols 3)

(defn next-row [row]
  (reduce (fn [r j] (assoc r j (+ (r (dec j)) (r j))))
          row
          (range 1 cols)))

(def grid
  (nth (iterate next-row (vec (repeat cols 1)))
       (dec rows)))

(println (last grid))
