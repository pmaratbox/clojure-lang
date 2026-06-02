(loop [n 1234
       total 0]
  (if (zero? n)
    (println total)
    (recur (quot n 10) (+ total (mod n 10)))))
