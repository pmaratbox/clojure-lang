(defn ext-gcd [a b]
  (if (zero? b)
    [a 1 0]
    (let [[g x y] (ext-gcd b (mod a b))]
      [g y (- x (* (quot a b) y))])))

(let [[g x y] (ext-gcd 30 12)]
  (println (str g " " x " " y)))
