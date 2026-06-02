(loop [i 1
       j 1
       out []]
  (cond
    (> i 3) (println (clojure.string/join "\n" out))
    (> j i) (recur (inc i) 1 out)
    (= (* i j) 4) (println (clojure.string/join "\n" (conj out (str "stop at " i "," j))))
    :else (recur i (inc j) (conj out (str i "," j)))))
