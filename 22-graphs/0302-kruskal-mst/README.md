# 0302 — Kruskal MST

Compute the MST total weight of edges (0,1,1),(1,2,2),(0,2,3) with union-find, printing `3`. Idiomatic Clojure threads an immutable parent map through a sorted-edge `loop`/`recur`.

## Run

    clojure -M main.clj
