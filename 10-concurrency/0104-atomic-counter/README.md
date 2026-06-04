# 0104 — Atomic Counter

Increment a shared atomic counter from multiple threads 1000 times total without a lock, printing `1000`. An `atom` with `swap!` applies lock-free compare-and-swap updates.

## Run

    clojure -M main.clj
