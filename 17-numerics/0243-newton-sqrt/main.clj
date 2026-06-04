(defn newton-sqrt [n]
  (loop [x (double n)]
    (let [nx (- x (/ (- (* x x) n) (* 2 x)))]
      (if (< (Math/abs (- nx x)) 1e-12)
        nx
        (recur nx)))))

(println (format "%.4f" (newton-sqrt 2)))
