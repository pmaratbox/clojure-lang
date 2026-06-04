(def dims [10 20 30 40])
(def n (dec (count dims)))

(def dp
  (reduce
   (fn [dp [i j]]
     (assoc-in dp [i j]
               (reduce min
                       (for [k (range i j)]
                         (+ (get-in dp [i k])
                            (get-in dp [(inc k) j])
                            (* (dims i) (dims (inc k)) (dims (inc j))))))))
   (vec (repeat n (vec (repeat n 0))))
   (for [len (range 1 n)
         i (range 0 (- n len))
         :let [j (+ i len)]]
     [i j])))

(println (get-in dp [0 (dec n)]))
