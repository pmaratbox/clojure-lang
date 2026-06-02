# 0055 — Frequency Count

Count how many times each letter appears in `banana` and print the per-letter counts in alphabetical order: `a:3 b:1 n:2`. `frequencies` returns a map of item-to-count in a single call; `(sort (keys counts))` orders the letters and `(counts ch)` looks each one up.

## Run

    clojure -M main.clj
