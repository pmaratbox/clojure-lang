# 0110 — Currying

Curry a two-argument add into a chain of one-argument functions and call it as `add(2)(3)`, printing `5`. A Clojure `fn` closes over `a`, so `(add 2)` returns a one-arg function.

## Run

    clojure -M main.clj
