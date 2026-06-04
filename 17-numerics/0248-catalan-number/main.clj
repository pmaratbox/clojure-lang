(defn catalans [k]
  (reductions
    (fn [c n] (quot (* c 2 (+ (* 2 n) 1)) (+ n 2)))
    1
    (range (dec k))))

(println (apply str (interpose " " (catalans 5))))
