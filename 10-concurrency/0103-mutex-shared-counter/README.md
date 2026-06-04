# 0103 — Mutex-Protected Counter

Have multiple threads each increment a shared counter under a mutex so the total is exactly `1000`. `locking` provides a monitor (mutex) around the critical section guarding the shared atom.

## Run

    clojure -M main.clj
