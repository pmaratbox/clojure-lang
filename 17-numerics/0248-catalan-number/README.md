# 0248 — Catalan Numbers

Print the first five Catalan numbers `1 1 2 5 14`. A `reductions` over the index applies the C(n+1)=C(n)*2*(2n+1)/(n+2) recurrence, keeping each intermediate.

## Run

    clojure -M main.clj
