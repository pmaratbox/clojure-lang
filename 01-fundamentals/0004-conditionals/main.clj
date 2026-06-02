(def n 7)

(cond
  (< n 10) (println n "is less than 10")
  (= n 10) (println n "is equal to 10")
  :else    (println n "is greater than 10"))
