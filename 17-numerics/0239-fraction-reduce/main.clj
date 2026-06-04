(defn gcd [a b] (if (zero? b) a (recur b (mod a b))))

(defn reduce-frac [n d]
  (let [g (gcd n d)]
    [(quot n g) (quot d g)]))

(let [[n d] (reduce-frac 6 8)]
  (println (str n "/" d)))
