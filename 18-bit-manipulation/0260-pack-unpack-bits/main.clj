(def r 1)
(def g 2)
(def b 3)

(def packed (bit-or (bit-shift-left r 16)
                    (bit-shift-left g 8)
                    b))

(println (bit-and (bit-shift-right packed 16) 0xff)
         (bit-and (bit-shift-right packed 8) 0xff)
         (bit-and packed 0xff))
