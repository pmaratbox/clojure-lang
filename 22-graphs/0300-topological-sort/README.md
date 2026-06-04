# 0300 — Topological Sort

Topologically sort the DAG 0->1,0->2,1->3,2->3 using the Kahn algorithm (smallest index first), printing `0 1 2 3`. Idiomatic Clojure keeps the in-degree map immutable and selects the smallest ready node each `loop` step.

## Run

    clojure -M main.clj
