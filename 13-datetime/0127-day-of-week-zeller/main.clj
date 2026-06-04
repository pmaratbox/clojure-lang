(defn zeller [y m d]
  (let [[y m] (if (< m 3) [(dec y) (+ m 12)] [y m])
        k (mod y 100)
        j (quot y 100)
        h (mod (+ d
                  (quot (* 13 (+ m 1)) 5)
                  k
                  (quot k 4)
                  (quot j 4)
                  (* 5 j))
               7)]
    ;; h: 0=Saturday, 1=Sunday, ... 6=Friday
    (nth ["Saturday" "Sunday" "Monday" "Tuesday" "Wednesday" "Thursday" "Friday"] h)))

(println (zeller 2000 1 1))
