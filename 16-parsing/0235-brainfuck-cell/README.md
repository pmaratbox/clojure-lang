# 0235 — Brainfuck Cell

Interpret the Brainfuck program "+++" on a single zeroed cell and print the cell value `3`. Clojure folds the program chars with `reduce` and a `case` over `+`/`-`.

## Run

    clojure -M main.clj
