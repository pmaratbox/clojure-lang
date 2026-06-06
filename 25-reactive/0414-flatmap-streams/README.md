# 0414 — FlatMap (mergeMap)

Implement flatMap/mergeMap: map each outer value to an inner timed stream and merge all inners concurrently (no cancellation). An atom holds the virtual-time scheduler state and events are ordered by sorting on [time seq].

## Run

    clojure -M main.clj
