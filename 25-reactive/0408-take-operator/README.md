# 0408 — Take Operator

Implement take(n) over an unbounded source of the natural numbers, emitting the first 3 then completing (and unsubscribing the source). `subscribe` returns an unsubscribe closure, and the source loops on an `active` atom so clearing it halts the infinite emission.

## Run

    clojure -M main.clj
