(declare is-odd)

(defn is-even [n]
  (if (= n 0) true (is-odd (dec n))))

(defn is-odd [n]
  (if (= n 0) false (is-even (dec n))))

(doseq [n [4 3]]
  (println (if (is-even n) "even" "odd")))
