# 0005 — Loops

Print 1..5 with `doseq` over a `range`. `doseq` iterates for side effects
(the explicit "do this for each"). `range` is **half-open** like Python's:
`(range 1 6)` produces `(1 2 3 4 5)`. For value iteration use `map` or the
list-comprehension-style `(for [x coll] expr)` (which is lazy and returns a
sequence rather than executing for side effects).

## Run

    clojure -M main.clj
