# 0044 — Generic Constraints

Write a generic `largest(a, b)` that requires an ordered type, then call it on integers (3 and 9) and on strings (apple and pear), printing `9` and `pear`. Clojure is dynamic and untyped, so `largest` takes any values and `compare` works on anything `Comparable` (numbers, strings, vectors). There is no constraint to declare.

## Run

    clojure -M main.clj
