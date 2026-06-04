(defn collatz-steps [n]
  (loop [n n steps 0]
    (if (= n 1)
      steps
      (recur (if (even? n) (quot n 2) (inc (* 3 n))) (inc steps)))))

(println (collatz-steps 6))
