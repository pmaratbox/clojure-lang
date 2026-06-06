# 0418 — ReplaySubject

Implement a ReplaySubject with a buffer of the last 2 values, replayed to a late subscriber, which then also receives new values. An atom holds the bounded buffer trimmed with take-last, and another holds the observer vector.

## Run

    clojure -M main.clj
