# 0308 — Strongly Connected Components

Count the strongly connected components of 0->1,1->2,2->0,2->3, printing `2`. Idiomatic Clojure runs Kosaraju: a finish-order DFS, then a reverse-graph DFS counting components.

## Run

    clojure -M main.clj
