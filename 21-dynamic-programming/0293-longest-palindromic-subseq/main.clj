(def s "bbbab")
(def n (count s))

(def dp
  (reduce
   (fn [dp [i j]]
     (let [v (if (= (.charAt s i) (.charAt s j))
               (+ 2 (if (<= (inc i) (dec j))
                      (get-in dp [(inc i) (dec j)]) 0))
               (max (get-in dp [(inc i) j])
                    (get-in dp [i (dec j)])))]
       (assoc-in dp [i j] v)))
   (vec (repeat n (vec (repeat n 0))))
   (for [i (range (dec n) -1 -1)
         j (range i n)]
     [i j])))

(println (get-in dp [0 (dec n)]))
