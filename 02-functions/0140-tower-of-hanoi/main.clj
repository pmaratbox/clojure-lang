(defn moves [n]
  (if (zero? n)
    0
    (+ (* 2 (moves (dec n))) 1)))

(println (moves 3))
