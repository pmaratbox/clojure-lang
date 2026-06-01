# 0037 — Operator Overloading

Define how `+` (or an `add` method) combines two points, then add `(1, 2)` and `(3, 4)` and print `(4, 6)`. Clojure operators like `+` are just functions and aren't overloaded per type; you instead write your own function (here `add`) over plain maps. Protocols can give type-dispatched "operators" when needed.

## Run

    clojure -M main.clj
