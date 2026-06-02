# 0098 — Memoization

Compute `fibonacci(10)` recursively with memoization (caching each result so it is computed once) and print it: `55`. `memoize` wraps a function with an automatic cache; because the recursive calls go through the memoized `fib` var, each subproblem is computed once.

## Run

    clojure -M main.clj
