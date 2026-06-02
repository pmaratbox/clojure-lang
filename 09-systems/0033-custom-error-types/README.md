# 0033 — Custom Error Types

Define a custom error, raise it from a `check` that rejects values over `100`, catch it for the input `200`, and print `error: value too large`. Rather than define a class, idiomatic Clojure throws `(ex-info message data-map)` — an `ExceptionInfo` carrying both a message and a data map (read back with `ex-data`). `try`/`catch` dispatches on the JVM exception class.

## Run

    clojure -M main.clj
