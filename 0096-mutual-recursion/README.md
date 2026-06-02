# 0096 — Mutual Recursion

Using two mutually recursive functions `isEven` and `isOdd` (each calling the other), report whether `4` and `3` are even, printing `even` and `odd`. Clojure resolves names top to bottom, so `(declare is-odd)` forward-declares it before `is-even` uses it.

## Run

    clojure -M main.clj
