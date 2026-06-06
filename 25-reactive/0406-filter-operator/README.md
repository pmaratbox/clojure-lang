# 0406 — Filter Operator

Implement a filter operator that forwards only values passing a predicate, keeping the even numbers of 1..6. In Clojure the operator wraps the source observer, calling `:next` only when the predicate (here `even?`) holds.

## Run

    clojure -M main.clj
