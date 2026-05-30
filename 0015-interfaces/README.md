# 0015 — Interfaces

Define a `Shape` interface with `name()` and `area()` methods, implement it for a rectangle and a square, then loop over a collection of shapes and print each one's area. Clojure's interface analog is a *protocol*: `defprotocol` names a set of functions, and each `defrecord` implements them inline. Protocol functions live in the namespace, so the first method is `shape-name` rather than `name` to avoid shadowing `clojure.core/name`. Calling `(area s)` dispatches on the type of its first argument — polymorphism by single-dispatch on the record.

## Run

    clojure -M main.clj
