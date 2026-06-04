# 0359 — Flatten Deeply

Flatten the arbitrarily nested structure [1,[2,[3,4]],5] into `1 2 3 4 5`. A recursive `mapcat` over `sequential?` nodes emits scalars in order.

## Run

    clojure -M main.clj
