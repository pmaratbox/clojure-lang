(defn rol8 [x n]
  (bit-and (bit-or (bit-shift-left x n)
                   (bit-shift-right x (- 8 n)))
           0xff))

(println (rol8 1 1) (rol8 128 1))
