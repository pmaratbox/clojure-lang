# 0298 — Bellman-Ford

On the digraph with a negative edge 0->1(1),1->2(-2),0->2(4), print the shortest distances from node 0 `0 1 -1`. Idiomatic Clojure folds the edge list V-1 times with nested `reduce` over persistent vectors.

## Run

    clojure -M main.clj
