# 0245 — Modular Exponentiation

Compute 3^13 mod 7 by fast modular exponentiation, printing `3`. A `loop`/`recur` squares the base and halves the exponent, folding in the bit each step.

## Run

    clojure -M main.clj
