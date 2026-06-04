(defn popcount [n]
  (Long/bitCount n))

(println (popcount (bit-xor 1 4)))
