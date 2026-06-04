# 0266 — DFA: Divisible by 3

Use a 3-state DFA over binary input to test whether "110" (6, yes) and "100" (4, no) are divisible by 3, printing `yes no`. `reduce` threads the running value-mod-3 state across the bits.

## Run

    clojure -M main.clj
