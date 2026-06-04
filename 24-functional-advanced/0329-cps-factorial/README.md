# 0329 — CPS Factorial

Compute 5! in continuation-passing style, printing `120`. Each recursive step threads a continuation closure and the final continuation is `identity`.

## Run

    clojure -M main.clj
