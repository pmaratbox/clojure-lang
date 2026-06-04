(defn mod-pow [base exp m]
  (loop [b (mod base m)
         e exp
         r 1]
    (if (zero? e)
      r
      (recur (mod (* b b) m)
             (quot e 2)
             (if (odd? e) (mod (* r b) m) r)))))

(println (mod-pow 3 13 7))
