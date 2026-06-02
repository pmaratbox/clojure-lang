# 0035 — Ranges & Slicing

From the list `[10, 20, 30, 40, 50]`, take the sub-sequence at indices 1 through 4 (exclusive) and print `slice: 20 30 40`. `(subvec nums 1 4)` returns a half-open sub-vector that structurally shares the original's storage in O(1). `(subs s 1 4)` slices strings with the same half-open bounds, though it copies the characters rather than sharing them; both results are immutable.

## Run

    clojure -M main.clj
