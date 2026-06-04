# 0148 — Parse or Default

Parse "42" to 42 and "x" (invalid) to a default 0, printing `42 0`. A `try`/`catch` around `Integer/parseInt` falls back to the default on a `NumberFormatException`.

## Run

    clojure -M main.clj
