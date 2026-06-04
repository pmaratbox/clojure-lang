# 0383 — Partition Into Runs

Partition [1,1,2,3,3,3] into runs of equal adjacent elements, printing `1 1|2|3 3 3`. Clojure's `partition-by identity` groups consecutive equal elements lazily.

## Run

    clojure -M main.clj
