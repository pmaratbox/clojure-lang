# 0343 — Optional Chaining

Read a deeply optional value a.b.c when present (5) and when absent (default 0), printing `5 0`. `get-in` walks a nested path and `or` supplies the fallback when a link is missing.

## Run

    clojure -M main.clj
