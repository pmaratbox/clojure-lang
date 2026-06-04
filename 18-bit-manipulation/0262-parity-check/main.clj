(defn parity [n]
  (bit-and (Long/bitCount n) 1))

(println (parity 7) (parity 5))
