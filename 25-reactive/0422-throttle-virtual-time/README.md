# 0422 — Throttle (Virtual Time)

Implement throttle(window) (leading edge) on a virtual-time scheduler: emit a value, then suppress further values for `window` ticks. Atoms hold the scheduler queue and clock, and the queue is popped by sorting on `[time seq]`.

## Run

    clojure -M main.clj
