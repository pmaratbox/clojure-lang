(let [a 3
      b 5
      a (bit-xor a b)
      b (bit-xor a b)
      a (bit-xor a b)]
  (println a b))
