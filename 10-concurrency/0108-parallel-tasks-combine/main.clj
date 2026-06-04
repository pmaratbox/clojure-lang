(let [a (future 10)
      b (future 20)]
  (println (+ (deref a) (deref b))))
