# 0401 — Create an Observable

Build a push-based Observable from scratch that emits 1, 2, 3 to its observer and then completes. In Clojure an observer is just a map of closures and the Observable is a function that invokes them on subscribe.

## Run

    clojure -M main.clj
