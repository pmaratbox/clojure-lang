# 0220 — Null Object

Compare a no-op null logger with a real logger; only the real one records, so print the logged count `1`. The null object satisfies the same `:log` interface with a do-nothing thunk.

## Run

    clojure -M main.clj
