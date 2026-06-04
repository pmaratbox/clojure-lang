# 0326 — Monoid Fold

Fold lists under two monoids: string concat ["a","b","c"]->"abc" and integer sum [1,2,3]->6, printing `abc 6`. A single `reduce` parameterized by an identity and a combine op covers both monoids.

## Run

    clojure -M main.clj
