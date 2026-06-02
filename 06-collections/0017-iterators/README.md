# 0017 — Iterators

Take the numbers 1 through 5, keep the even ones, double each, and add them up — a filter, then a map, then a reduce — printing the final sum. The thread-last macro `->>` pipes the collection through each step as the last argument, so it reads top to bottom: `(filter even?)`, then `(map #(* 2 %))`, then `(reduce +)`. `filter` and `map` return lazy sequences, and `reduce` is the explicit fold that collapses them to a single number.

## Run

    clojure -M main.clj
