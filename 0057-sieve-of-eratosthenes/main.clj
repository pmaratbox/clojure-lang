(def n 10)

(loop [sieve (vec (repeat (inc n) true))
       i 2]
  (if (<= (* i i) n)
    (recur (if (sieve i)
             (reduce (fn [s j] (assoc s j false))
                     sieve
                     (range (* i i) (inc n) i))
             sieve)
           (inc i))
    (println (clojure.string/join " "
                                  (filter #(get sieve %) (range 2 (inc n)))))))
