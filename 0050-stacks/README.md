# 0050 — Stacks

Push `1`, `2`, and `3` onto a stack, then pop them all off and print them in last-in-first-out order: `3 2 1`. A Clojure list is a stack: `conj` adds to the front, `peek` reads the front, and `pop` returns the list without it. Building `(reduce conj '() ...)` leaves the items in pop order.

## Run

    clojure -M main.clj
