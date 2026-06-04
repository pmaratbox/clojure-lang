# 0195 — Defer LIFO Order

Register three deferred actions printing 1, 2, 3 and show they run in last-in-first-out order `3 2 1`. Clojure has no `defer`, so we push onto an atom-held vector and replay it in reverse.

## Run

    clojure -M main.clj
