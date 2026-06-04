(defn horner [coeffs x]
  (reduce (fn [acc c] (+ (* acc x) c)) 0 coeffs))

(println (horner [2 3 1] 2))
