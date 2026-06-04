# 0296 — Matrix Chain Order

Find the minimum scalar multiplications to multiply matrices with dimensions [10,20,30,40], printing `18000`. A `reduce` over increasing chain lengths fills the DP table via `assoc-in`/`get-in`.

## Run

    clojure -M main.clj
