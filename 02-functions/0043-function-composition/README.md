# 0043 — Function Composition

Compose `inc` (add one) and `twice` (multiply by two) into one function and apply it to `3`, so `inc(twice(3))` prints `7`. Clojure has composition built in: `(comp inc twice)` returns a function applying `twice` then `inc` (right to left). `comp` accepts any number of functions, and `inc` is a core function.

## Run

    clojure -M main.clj
