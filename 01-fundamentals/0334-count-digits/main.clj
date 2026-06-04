(loop [n 90210 c 0]
  (if (zero? n)
    (println c)
    (recur (quot n 10) (inc c))))
