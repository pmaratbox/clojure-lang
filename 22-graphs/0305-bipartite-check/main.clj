(defn build-adj [n edges]
  (reduce (fn [m [u v]] (-> m (update u conj v) (update v conj u)))
          (zipmap (range n) (repeat []))
          edges))

(defn bipartite? [n edges]
  (let [adj (build-adj n edges)]
    (loop [color {0 0} queue [0]]
      (if (empty? queue)
        true
        (let [u (peek queue)
              nbrs (adj u)]
          (if (some #(= (color %) (color u)) nbrs)
            false
            (let [new (remove color nbrs)
                  color (reduce #(assoc %1 %2 (- 1 (color u))) color new)]
              (recur color (into (pop queue) new)))))))))

(def cycle4 [[0 1] [1 2] [2 3] [3 0]])
(def tri [[0 1] [1 2] [2 0]])

(println (str (if (bipartite? 4 cycle4) "yes" "no")
              " "
              (if (bipartite? 3 tri) "yes" "no")))
