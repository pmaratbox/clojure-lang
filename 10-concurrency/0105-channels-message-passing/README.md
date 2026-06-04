# 0105 — Channels / Message Passing

Send the values 1, 2, 3 through a channel (or queue) from one thread and receive them in order, printing `1 2 3`. A `LinkedBlockingQueue` carries values between a producer `future` and the consuming loop.

## Run

    clojure -M main.clj
