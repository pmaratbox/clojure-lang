# 0026 — Sets

Build a set from `1, 2, 2, 3` so the duplicate collapses, then print its `size: 3` and whether it contains `2` (`has 2: yes`) and `5` (`has 5: no`). `(set [...])` builds an immutable hash set, collapsing the duplicate; `count` gives the size and `contains?` tests membership (by key, not a value scan). The literal `#{...}` exists too but rejects duplicate entries at read time.

## Run

    clojure -M main.clj
