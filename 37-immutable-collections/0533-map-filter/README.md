# 0533 — Map & filter

Clojure's persistent (immutable) vector `[1 2 3 4 5]` is transformed with `clojure.core`'s `filter` and `map`. Each call RETURNS A NEW lazy sequence and never mutates the original vector: `filter even?` yields a new sequence `(2 4)`, then `map #(* % 10)` yields another new sequence `(20 40)`. Printed space-joined with `clojure.string/join` -> `20 40`.

## Run

    clojure -M main.clj
