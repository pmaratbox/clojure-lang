# 0332 — Y Combinator

Define factorial via a fixed-point combinator (no named self-recursion) and compute 5!, printing `120`. The applicative-order Y combinator wraps the recursive call in a thunk and feeds the non-recursive generator its own fixed point.

## Run

    clojure -M main.clj
