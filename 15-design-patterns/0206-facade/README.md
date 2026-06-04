# 0206 — Facade

Expose a single facade call that starts three subsystems and reports `ready`. A `start` function sequences the three subsystem inits and returns the status string.

## Run

    clojure -M main.clj
