(let [t1 (future (* 3 3))
      t2 (future (* 4 4))]
  (println (+ (deref t1) (deref t2))))
