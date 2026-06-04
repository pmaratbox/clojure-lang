# 0368 — Shell Sort

Shell-sort [5,2,8,1,9,3] ascending, printing `1 2 3 5 8 9`. Idiomatic Clojure folds a gapped insertion sort over a shrinking gap sequence with `reduce` and `loop`/`recur`.

## Run

    clojure -M main.clj
