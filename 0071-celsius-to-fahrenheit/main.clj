(doseq [c [100 0]]
  (let [f (+ (quot (* c 9) 5) 32)]
    (println (str c "C = " f "F"))))
