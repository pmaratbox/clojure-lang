(defn gcd [a b]
  (if (zero? b) a (recur b (mod a b))))

(defn lcm [a b]
  (* (quot a (gcd a b)) b))

(println (lcm 4 6))
