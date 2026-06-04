# 0320 — Fenwick Tree Prefix Sum

Build a Fenwick (BIT) tree over [1,2,3,4,5] and query the prefix sum of the first 4 elements, printing `10`. Idiomatic Clojure keeps the BIT in a persistent vector and walks the low-bit with `bit-and`.

## Run

    clojure -M main.clj
