# 0020 — Pattern Matching

Match `n` against the literal patterns `1` and `2` with a wildcard fallback, mapping `1`, `2`, and `5` to `one`, `two`, and `many`. `case` dispatches on a compile-time constant in near-constant time, with the trailing expression as the default; it compares by value and does not evaluate the test keys. For richer conditional logic, `cond` and the `core.match` library handle predicates and destructuring.

## Run

    clojure -M main.clj
