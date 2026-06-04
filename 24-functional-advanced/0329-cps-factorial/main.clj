(defn fact-cps [n k]
  (if (zero? n)
    (k 1)
    (fact-cps (dec n) (fn [r] (k (* n r))))))

(println (fact-cps 5 identity))
