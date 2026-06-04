# 0288 — Longest Increasing Subsequence

Compute the LIS length of [10,9,2,5,3,7,101,18], printing `4`. A `reduce` builds the per-index DP vector, then `reduce max` reads off the answer.

## Run

    clojure -M main.clj
