# 0301 — Directed Cycle Detection

Detect a cycle in the digraph 0->1,1->2,2->0, printing `cycle`. Idiomatic Clojure tracks white/gray/black DFS colors in an `atom` and reports a back edge to a gray node.

## Run

    clojure -M main.clj
