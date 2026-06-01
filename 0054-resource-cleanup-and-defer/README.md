# 0054 — Resource Cleanup & Defer

Acquire a resource, use it, and let the language release it automatically at scope exit, printing `open`, `use`, and `close` in that order. `with-open` binds a resource and calls `.close` on it when the body finishes, even on an exception; it works on anything implementing `java.io.Closeable` (here built with `reify`).

## Run

    clojure -M main.clj
