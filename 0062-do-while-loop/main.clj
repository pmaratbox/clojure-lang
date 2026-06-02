(loop [i 1
       out []]
  (let [out (conj out (str i))]
    (if (< i 3)
      (recur (inc i) out)
      (println (clojure.string/join " " out)))))
