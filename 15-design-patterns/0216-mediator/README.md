# 0216 — Mediator

Have colleague A send "hi" through a mediator to colleague B, which prints `B got: hi`. The mediator function is the only coupling point and routes A's message to B's receive.

## Run

    clojure -M main.clj
