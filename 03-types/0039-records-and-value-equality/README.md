# 0039 — Records & Value Equality

Create two points with the same fields, print one as `point: (1, 2)`, and compare them by value to print `equal: yes`. Clojure values are compared structurally by `=`: a `defrecord` instance equals another with the same type and fields. Immutability and value equality are the language's defaults, not opt-ins.

## Run

    clojure -M main.clj
