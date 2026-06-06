# 0412 — Combine Latest

Implement combineLatest of two timed streams, emitting the pair of latest values whenever either source emits (once both have emitted). Atoms hold the scheduler's event vector and each stream's latest value, sorted by [time seq] for deterministic virtual time.

## Run

    clojure -M main.clj
