# 0407 — Scan (Running Fold)

Implement a scan operator that emits the running accumulation; produce the running sums of 1, 2, 3, 4. An atom holds the seeded accumulator and `swap!` folds each value before re-emitting.

## Run

    clojure -M main.clj
