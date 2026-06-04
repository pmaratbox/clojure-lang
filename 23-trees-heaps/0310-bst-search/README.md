# 0310 — BST Search

Insert 5,3,8,1,4 into a BST, then search for 4 (yes) and 6 (no), printing `yes no`. Idiomatic Clojure builds the tree with `reduce` over nested maps and descends via `recur`.

## Run

    clojure -M main.clj
