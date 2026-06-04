# 0331 — Transducer Pipeline

Compose map(+1) with filter(even) and run it over [1,2,3,4], printing `2 4`. `comp` of `map` and `filter` builds a transducer that `sequence` applies in a single pass.

## Run

    clojure -M main.clj
