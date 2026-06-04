(defn attempt [n]
  (= n 3))

(loop [n 1]
  (if (attempt n)
    (println (str "ok after " n))
    (recur (inc n))))
