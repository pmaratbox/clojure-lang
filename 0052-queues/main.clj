(loop [q (-> clojure.lang.PersistentQueue/EMPTY
             (conj 1)
             (conj 2)
             (conj 3))
       out []]
  (if (seq q)
    (recur (pop q) (conj out (str (peek q))))
    (println (clojure.string/join " " out))))
