# 0264 — Turnstile FSM

Drive a turnstile (locked/unlocked) with events coin, push, push and print the resulting states `unlocked locked locked`. `reductions` over the event sequence yields each new state cleanly.

## Run

    clojure -M main.clj
