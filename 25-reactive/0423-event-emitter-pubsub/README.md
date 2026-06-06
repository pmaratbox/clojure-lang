# 0423 — EventEmitter (Pub/Sub)

Build a multi-topic EventEmitter with on(topic, handler), emit(topic, payload), and off(topic, handler). An atom holds a map of topic to a vector of handler closures.

## Run

    clojure -M main.clj
