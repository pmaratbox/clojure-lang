# 0250 — Iterative Fast Power

Compute 2^10 by iterative binary exponentiation, printing `1024`. A `loop`/`recur` squares the base while halving the exponent, multiplying in on each set bit.

## Run

    clojure -M main.clj
