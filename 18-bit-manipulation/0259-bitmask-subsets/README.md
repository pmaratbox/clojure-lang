# 0259 — Enumerate Submasks

Enumerate all submasks of the mask 5 (101) in descending order `5 4 1 0`. A `loop`/`recur` accumulates each `(bit-and (dec sub) mask)` step into a persistent vector, stopping once it emits 0.

## Run

    clojure -M main.clj
