# 0070 — Digit Sum

Sum the decimal digits of `1234` (repeatedly take the last digit with `% 10` and drop it with `/ 10`) and print the total: `10`. `mod` takes the last digit and `quot` is integer division that drops it; `recur` loops until `n` is zero.

## Run

    clojure -M main.clj
