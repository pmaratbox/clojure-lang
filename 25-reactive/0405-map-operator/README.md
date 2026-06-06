# 0405 — Map Operator

Implement a map operator that transforms each emitted value, applying x => x*2 to a stream of 1, 2, 3, 4. Observers are plain maps of `:next`/`:error`/`:complete` closures, and `map-op` wraps a source Observable to forward `(f value)`.

## Run

    clojure -M main.clj
