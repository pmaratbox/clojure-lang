# 0014 — Higher-Order Functions

Write a higher-order function that calls `f` on `x`, then pass it two different
functions, increment and double. Functions are first-class in Clojure; `#(+ % 1)`
is shorthand for `(fn [x] (+ x 1))`. They are bound with `let` here because
`inc`, `double`, and `apply` are all names in `clojure.core`.

## Run

    clojure -M main.clj
