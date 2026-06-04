# 0372 — Dutch National Flag

Three-way partition [2,0,2,1,1,0] of values 0/1/2 in one pass, printing `0 0 1 1 2 2`. Idiomatic Clojure carries the low/mid/high pointers and the working vector through `loop`/`recur`, swapping with `assoc`.

## Run

    clojure -M main.clj
