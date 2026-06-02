# 0025 — Tuples & Multiple Return

Return both the smaller and larger of `3` and `7` from one function, unpacking the pair to print `min: 3` and `max: 7`. The two results are returned in a vector `[lo hi]` and pulled apart with destructuring in the `let` binding `[[lo hi] (min-max ...)]`. Vectors are the idiomatic lightweight tuple, and positional destructuring works on any sequential collection.

## Run

    clojure -M main.clj
