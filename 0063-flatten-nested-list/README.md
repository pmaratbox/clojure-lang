# 0063 — Flatten Nested List

Flatten the nested list `[[1, 2], [3, 4]]` into a single flat sequence and print its elements: `1 2 3 4`. `(apply concat nested)` concatenates the sub-sequences into one lazy sequence (flattening a single level); `flatten` would descend through all levels.

## Run

    clojure -M main.clj
