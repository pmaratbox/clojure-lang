(defn reverse-int [n]
  (loop [n n acc 0]
    (if (zero? n)
      acc
      (recur (quot n 10) (+ (* acc 10) (mod n 10))))))

(println (reverse-int 1234))
