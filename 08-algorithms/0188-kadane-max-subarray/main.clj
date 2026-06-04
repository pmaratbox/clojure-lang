(defn kadane [xs]
  (loop [cur (first xs) best (first xs) more (rest xs)]
    (if (empty? more)
      best
      (let [x (first more)
            cur' (max x (+ cur x))]
        (recur cur' (max best cur') (rest more))))))

(println (kadane [-2 1 -3 4 -1 2 1 -5 4]))
