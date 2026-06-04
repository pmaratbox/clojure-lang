# 0365 — Multiset Counts

Add 1,1,2 to a multiset; print the count of 1 (2), remove one 1, then print the count of 1 (1), as `2 1`. An `atom` holding a count map uses `(fnil inc 0)` to add and decrements on remove.

## Run

    clojure -M main.clj
