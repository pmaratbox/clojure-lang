# 0290 — Unique Grid Paths

Count lattice paths from the top-left to bottom-right of a 3x3 grid moving right/down, printing `6`. A lazy `iterate` rolls one DP row forward over a persistent vector.

## Run

    clojure -M main.clj
