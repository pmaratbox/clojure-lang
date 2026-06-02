(loop [a 0
       b 1
       n 7
       out []]
  (if (zero? n)
    (println (clojure.string/join " " out))
    (recur b (+ a b) (dec n) (conj out (str a)))))
