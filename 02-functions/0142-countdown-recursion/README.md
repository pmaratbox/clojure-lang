# 0142 — Countdown by Recursion

Recursively count down from 5 to 1, printing `5 4 3 2 1` on one line. The recursion builds a lazy sequence with `cons`, which `interpose` then joins into a single line.

## Run

    clojure -M main.clj
