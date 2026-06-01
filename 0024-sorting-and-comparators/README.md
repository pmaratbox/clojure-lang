# 0024 — Sorting & Comparators

Sort `[3, 1, 2]` ascending, then again with a custom comparator that reverses the order, printing `asc: 1 2 3` and `desc: 3 2 1`. `sort` returns a new sorted sequence; with one argument it uses natural ordering, and passing a comparator like `>` sorts descending. Comparators are plain two-argument functions, and the input collection is left unchanged.

## Run

    clojure -M main.clj
