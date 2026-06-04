(defn gcd [a b] (if (zero? b) a (recur b (mod a b))))

(defn add-frac [[n1 d1] [n2 d2]]
  (let [n (+ (* n1 d2) (* n2 d1))
        d (* d1 d2)
        g (gcd (Math/abs n) d)]
    [(quot n g) (quot d g)]))

(let [[n d] (add-frac [1 2] [1 3])]
  (println (str n "/" d)))
