(def edges [[0 1 1] [1 2 -2] [0 2 4]])
(def n 3)

(defn bellman-ford [src]
  (reduce (fn [d _]
            (reduce (fn [d [u v w]]
                      (if (and (not= (d u) Long/MAX_VALUE)
                               (< (+ (d u) w) (d v)))
                        (assoc d v (+ (d u) w))
                        d))
                    d edges))
          (assoc (vec (repeat n Long/MAX_VALUE)) src 0)
          (range (dec n))))

(println (apply str (interpose " " (bellman-ford 0))))
