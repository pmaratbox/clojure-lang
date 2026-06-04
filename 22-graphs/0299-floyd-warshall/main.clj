(def n 3)
(def inf (/ Long/MAX_VALUE 4))

(def init
  (-> (vec (repeat n (vec (repeat n inf))))
      (assoc-in [0 0] 0) (assoc-in [1 1] 0) (assoc-in [2 2] 0)
      (assoc-in [0 1] 3) (assoc-in [1 2] 1) (assoc-in [0 2] 5)))

(def dist
  (reduce (fn [d k]
            (reduce (fn [d i]
                      (reduce (fn [d j]
                                (if (< (+ (get-in d [i k]) (get-in d [k j]))
                                       (get-in d [i j]))
                                  (assoc-in d [i j] (+ (get-in d [i k]) (get-in d [k j])))
                                  d))
                              d (range n)))
                    d (range n)))
          init (range n)))

(println (get-in dist [0 2]))
