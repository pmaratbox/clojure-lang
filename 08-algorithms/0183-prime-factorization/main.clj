(defn factorize [n]
  (loop [n n d 2 acc []]
    (cond
      (= n 1) acc
      (zero? (mod n d)) (recur (quot n d) d (conj acc d))
      :else (recur n (inc d) acc))))

(println (clojure.string/join " " (factorize 60)))
