# 0112 — Predicate Combinators

Combine predicates with AND/OR/NOT: test `isEven AND isPositive` on 4 (yes) and -4 (no), printing `yes no`. A combinator closes over two predicates and returns their conjunction as a new function.

## Run

    clojure -M main.clj
