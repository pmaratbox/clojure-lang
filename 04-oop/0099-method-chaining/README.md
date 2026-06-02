# 0099 — Method Chaining

Build a calculator that supports method chaining — start at `5`, then `.add(3).multiply(2)` — and print the result: `16`. Clojure has no mutable methods; the `->` threading macro passes each result as the first argument of the next call — the functional equivalent of chaining.

## Run

    clojure -M main.clj
