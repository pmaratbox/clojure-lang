# 0011 — Error Handling

Write a `divide(a, b)` that signals a zero divisor, then call it on `10 / 2`
(prints the result) and `10 / 0` (prints an error). Clojure runs on the JVM and
uses **exceptions**: `(throw (ex-info "msg" {}))` raises an `ExceptionInfo`,
`try` / `catch` handles it, and `(.getMessage e)` reads the text. `quot` is
integer division.

## Run

    clojure -M main.clj
