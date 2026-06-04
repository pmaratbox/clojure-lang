# 0319 — Segment Tree Range Sum

Build a segment tree over [1,2,3,4,5] and query the sum of indices 1..3 (inclusive), printing `9`. Idiomatic Clojure stores the tree in a `2n` persistent vector and folds the range query with `loop`/`recur`.

## Run

    clojure -M main.clj
