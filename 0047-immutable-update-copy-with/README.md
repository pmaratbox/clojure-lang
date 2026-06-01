# 0047 — Immutable Update (Copy-with)

Make a copy of the point `(1, 2)` with its `x` changed to `9`, leaving the original intact, and print `original: (1, 2)` then `updated: (9, 2)`. Clojure maps are immutable and persistent: `(assoc p1 :x 9)` returns a new map that shares structure with `p1` and overrides `:x`. The original `p1` is never modified.

## Run

    clojure -M main.clj
