# 0196 — Error Wrapping

Wrap an inner error "inner" inside an outer context and print the combined message `outer: inner`. Clojure's `ex-info` takes a cause as its third argument, recoverable via `(.getCause e)`.

## Run

    clojure -M main.clj
