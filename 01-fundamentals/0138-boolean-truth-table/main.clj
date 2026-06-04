(doseq [[a b] [[true true] [true false] [false true] [false false]]]
  (println a b (and a b) (or a b) (not= a b)))
