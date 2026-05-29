# 0013 — Optional

Hold one value that is present (`42`) and one that is absent, then print each
with a fallback of `-1` when absent. `nil` represents absence, and `(or x -1)`
supplies the fallback. Because only `nil` and `false` are falsy in Clojure, `or`
correctly keeps a legitimate `0`.

## Run

    clojure -M main.clj
