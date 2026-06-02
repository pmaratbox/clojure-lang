# 0003 — Arithmetic & operators

Compute and print the five elementary arithmetic operations on two integers
(`a = 17`, `b = 5`). Clojure uses prefix notation — `(+ a b)`, `(- a b)`,
`(* a b)`. The `/` function on two integers returns a `Ratio` (`17/5`), not
a truncated int; `quot` gives the integer quotient and `rem` the remainder.

## Run

    clojure -M main.clj
