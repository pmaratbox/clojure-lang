# 0402 — Observer Contract

Demonstrate the observer contract next*-then-terminal: emit 1 and 2, complete, and show that a post-complete next is ignored. An atom holds the `stopped` flag that gates the closures returned in the observer map.

## Run

    clojure -M main.clj
