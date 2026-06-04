(def adj {0 [1 2] 1 [3] 2 [3] 3 []})
(def n 4)

(defn indegrees []
  (reduce (fn [m vs] (reduce #(update %1 %2 inc) m vs))
          (zipmap (range n) (repeat 0))
          (vals adj)))

(defn kahn []
  (loop [indeg (indegrees) order []]
    (let [ready (->> (range n)
                     (filter #(and (zero? (indeg %)) (not (some #{%} order))))
                     sort)]
      (if (empty? ready)
        order
        (let [u (first ready)
              indeg (reduce #(update %1 %2 dec) (assoc indeg u -1) (adj u))]
          (recur indeg (conj order u)))))))

(println (apply str (interpose " " (kahn))))
