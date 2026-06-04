# 0317 — Heap Sort

Heap-sort [5,3,8,1,4] ascending, printing `1 3 4 5 8`. Idiomatic Clojure builds a max-heap in a persistent vector, then swaps the root to the shrinking tail.

## Run

    clojure -M main.clj
