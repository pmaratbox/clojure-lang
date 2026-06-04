(def edges {0 [[1 4] [2 1]] 2 [[1 2] [3 5]] 1 [[3 1]]})
(def n 4)

(defn dijkstra [src]
  (loop [dist (assoc (vec (repeat n Long/MAX_VALUE)) src 0)
         prev (vec (repeat n -1))
         visited #{}]
    (let [u (->> (range n) (remove visited) (sort-by dist) first)]
      (if (or (nil? u) (= (dist u) Long/MAX_VALUE))
        prev
        (let [[d p] (reduce (fn [[d p] [v w]]
                              (if (< (+ (dist u) w) (d v))
                                [(assoc d v (+ (dist u) w)) (assoc p v u)]
                                [d p]))
                            [dist prev]
                            (get edges u []))]
          (recur d p (conj visited u)))))))

(defn path [prev target]
  (loop [cur target acc ()]
    (if (= cur -1)
      acc
      (recur (prev cur) (cons cur acc)))))

(println (apply str (interpose " " (path (dijkstra 0) 3))))
