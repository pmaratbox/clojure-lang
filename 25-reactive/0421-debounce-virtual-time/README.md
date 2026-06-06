# 0421 — Debounce (Virtual Time)

Implement debounce(window) on a virtual-time scheduler: emit a value only after a quiet gap of `window` ticks with no newer value. An atom holds the scheduler's queue and clock, and events sort by `[time seq]` so equal times break by insertion order.

## Run

    clojure -M main.clj
