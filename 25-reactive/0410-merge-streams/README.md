# 0410 — Merge Streams

Implement merge of two timed streams using a virtual-time scheduler, interleaving them by emission time. Uses an atom for the scheduler state and sorts pending events by [time seq] to break ties deterministically.

## Run

    clojure -M main.clj
