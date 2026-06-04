;; Breadth-first search using a queue and a visited set.
(def graph {0 [1 2]
            1 [0 3]
            2 [0 3]
            3 [1 2]})

(defn bfs [g start]
  (loop [queue [start]
         visited #{start}
         order []]
    (if (empty? queue)
      order
      (let [node (first queue)
            nbrs (remove visited (g node))]
        (recur (into (subvec queue 1) nbrs)
               (into visited nbrs)
               (conj order node))))))

(println (apply str (interpose " " (bfs graph 0))))
