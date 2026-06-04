;; Undirected graph as an adjacency map.
(def graph {0 [1 2]
            1 [0 3]
            2 [0 3]
            3 [1 2]})

(println (apply str (interpose " " (graph 0))))
