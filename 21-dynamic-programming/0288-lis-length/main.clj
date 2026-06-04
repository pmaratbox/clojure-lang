(def nums [10 9 2 5 3 7 101 18])

(def dp
  (reduce
   (fn [dp i]
     (assoc dp i
            (reduce max 1
                    (for [j (range i) :when (< (nums j) (nums i))]
                      (inc (dp j))))))
   (vec (repeat (count nums) 1))
   (range (count nums))))

(println (reduce max dp))
