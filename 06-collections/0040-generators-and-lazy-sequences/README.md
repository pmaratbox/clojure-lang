# 0040 — Generators & Lazy Sequences

Produce an endless lazy sequence of squares and take only the first three, printing `1 4 9`. Clojure sequences are lazy: `(iterate inc 1)` is an infinite seq, `map` squares lazily, and `take 3` realizes only what is needed. Laziness lets you compose with infinite sequences safely.

## Run

    clojure -M main.clj
