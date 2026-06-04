(defn gray [n]
  (bit-xor n (bit-shift-right n 1)))

(apply println (map gray (range 4)))
