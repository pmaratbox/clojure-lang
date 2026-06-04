(defn power-of-two? [n]
  (and (pos? n) (zero? (bit-and n (dec n)))))

(println (if (power-of-two? 16) "yes" "no")
         (if (power-of-two? 18) "yes" "no"))
