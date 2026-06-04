(def edges {0 [[1 4] [2 1]] 2 [[1 2] [3 5]] 1 [[3 1]]})
(def n 4)

(defn dijkstra [src]
  (loop [dist (assoc (vec (repeat n Long/MAX_VALUE)) src 0)
         visited #{}]
    (let [u (->> (range n)
                 (remove visited)
                 (sort-by dist)
                 first)]
      (if (or (nil? u) (= (dist u) Long/MAX_VALUE))
        dist
        (let [d (reduce (fn [d [v w]]
                          (if (< (+ (dist u) w) (d v))
                            (assoc d v (+ (dist u) w))
                            d))
                        dist
                        (get edges u []))]
          (recur d (conj visited u)))))))

(println (apply str (interpose " " (dijkstra 0))))
