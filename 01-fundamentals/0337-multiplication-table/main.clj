(doseq [i (range 1 4)]
  (apply println (map #(* i %) (range 1 4))))
