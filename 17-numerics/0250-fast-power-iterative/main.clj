(defn fast-pow [base exp]
  (loop [b base
         e exp
         r 1]
    (if (zero? e)
      r
      (recur (* b b)
             (quot e 2)
             (if (odd? e) (* r b) r)))))

(println (fast-pow 2 10))
