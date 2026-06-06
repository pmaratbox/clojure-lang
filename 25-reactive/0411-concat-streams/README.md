# 0411 — Concat Streams

Implement concat: subscribe to the second source only after the first completes; concat [1,2] then [3,4]. In Clojure an observer is just a map of `:next`/`:error`/`:complete` closures, so concat re-subscribes to `b` from inside `a`'s `:complete`.

## Run

    clojure -M main.clj
