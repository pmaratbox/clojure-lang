# 0090 — Binary Search Tree

Insert `5, 3, 8, 1, 4` into a binary search tree and print an in-order traversal (which yields the values in sorted order): `1 3 4 5 8`. Each node is an immutable map; `insert` returns a new tree with `assoc`, and `reduce` threads the inserts. In-order traversal concatenates left, node, right.

## Run

    clojure -M main.clj
