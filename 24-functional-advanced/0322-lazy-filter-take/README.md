# 0322 — Lazy Filter + Take

From a lazy stream of naturals, filter the even ones and take three, printing `2 4 6`. `filter` is lazy, so it only consumes as much of the infinite seq as `take` demands.

## Run

    clojure -M main.clj
