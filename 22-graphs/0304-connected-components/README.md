# 0304 — Connected Components

Count the connected components of the undirected graph with edges (0,1),(1,2),(3,4) over nodes 0..4, printing `2`. Idiomatic Clojure runs a stack-based DFS flood fill, accumulating the visited set immutably.

## Run

    clojure -M main.clj
