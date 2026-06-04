# 0303 — Prim MST

Compute the MST total weight of the chain (0,1,1),(1,2,2),(2,3,3) with Prim, printing `6`. Idiomatic Clojure grows the tree set in a `loop`, picking the cheapest crossing edge via `min-key`.

## Run

    clojure -M main.clj
