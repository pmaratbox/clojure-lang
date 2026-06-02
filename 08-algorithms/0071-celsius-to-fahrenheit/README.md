# 0071 — Celsius to Fahrenheit

Convert `100` and `0` degrees Celsius to Fahrenheit using `F = C * 9 / 5 + 32`, printing `100C = 212F` and `0C = 32F`. `quot` is integer division; the prefix form `(+ (quot (* c 9) 5) 32)` makes the evaluation order explicit.

## Run

    clojure -M main.clj
