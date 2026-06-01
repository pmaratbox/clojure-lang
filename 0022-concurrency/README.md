# 0022 — Concurrency

Start two tasks that produce `1` and `2`, let them run concurrently, then join their results and print `sum: 3`. `future` runs its body on a background thread pool and returns immediately; dereferencing with `@` blocks until the value is ready. Calling `shutdown-agents` lets the JVM exit promptly instead of waiting out the pool's idle keep-alive.

## Run

    clojure -M main.clj
