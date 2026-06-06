# 0417 — BehaviorSubject

Implement a BehaviorSubject that holds a current value and replays it immediately to each new subscriber. An atom holds the current value and another holds the observer vector, kept in sync via swap!/reset!.

## Run

    clojure -M main.clj
