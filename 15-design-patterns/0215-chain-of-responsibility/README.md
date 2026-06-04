# 0215 — Chain of Responsibility

Pass a request of level 2 along a handler chain so the level-2 handler handles it, printing `handled by 2`. Each handler is a closure that either handles the request or forwards to the next handler function.

## Run

    clojure -M main.clj
