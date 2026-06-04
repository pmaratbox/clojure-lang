# 0270 — Elevator FSM

Move an elevator from floor 0 up to floor 2 then back to 0, printing every floor it stops at `0 1 2 1 0`. `reduce` accumulates each visited floor while stepping toward each target.

## Run

    clojure -M main.clj
