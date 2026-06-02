# 0052 — Queues

Enqueue `1`, `2`, and `3` into a queue, then dequeue them all and print them in first-in-first-out order: `1 2 3`. `clojure.lang.PersistentQueue/EMPTY` is the immutable queue: `conj` adds at the rear, `peek` reads the front, and `pop` returns the queue without its front — FIFO, unlike a list or vector where those act at one end.

## Run

    clojure -M main.clj
