(def price 25)

(loop [coins [10 10 5] total 0]
  (if (>= total price)
    (println "dispensed")
    (recur (rest coins) (+ total (first coins)))))
