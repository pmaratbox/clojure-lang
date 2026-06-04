(defn sum-step [n acc]
  (if (> n 100)
    acc
    #(sum-step (inc n) (+ acc n))))

(println (trampoline sum-step 1 0))
