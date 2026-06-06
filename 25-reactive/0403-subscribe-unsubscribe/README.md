# 0403 — Subscribe and Unsubscribe

Return a Subscription from subscribe() and use it to unsubscribe so later values are not delivered. An atom holds the `closed` flag that the producer checks before each next, and the subscription's `unsubscribe` closure flips it.

## Run

    clojure -M main.clj
