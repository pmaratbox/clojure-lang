# 0217 — Memento

Save state 1, change it to 2, then restore from the memento, printing current then restored `2 1`. The memento is simply the captured immutable value of the atom, restored with `reset!`.

## Run

    clojure -M main.clj
