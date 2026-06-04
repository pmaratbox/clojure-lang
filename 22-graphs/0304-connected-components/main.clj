(def edges [[0 1] [1 2] [3 4]])
(def n 5)

(def adj
  (reduce (fn [m [u v]] (-> m (update u conj v) (update v conj u)))
          (zipmap (range n) (repeat []))
          edges))

(defn components []
  (loop [seen #{} count 0 nodes (range n)]
    (if (empty? nodes)
      count
      (let [u (first nodes)]
        (if (seen u)
          (recur seen count (rest nodes))
          (let [reached (loop [stack [u] vis #{}]
                          (if (empty? stack)
                            vis
                            (let [x (peek stack)]
                              (if (vis x)
                                (recur (pop stack) vis)
                                (recur (into (pop stack) (adj x)) (conj vis x))))))]
            (recur (into seen reached) (inc count) (rest nodes))))))))

(println (components))
