(defn classify [n]
  (cond
    (< n 0) "negative"
    (= n 0) "zero"
    :else "positive"))

(doseq [n [-1 0 5]]
  (println (classify n)))
