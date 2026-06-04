# 0378 — Barrier Synchronization

Have 3 threads each arrive at a barrier before any proceeds, then print `all reached: 3`. In Clojure each `future` increments a shared `atom` and spin-waits until all have arrived.

## Run

    clojure -M main.clj
