# 0373 — Exception Hierarchy

Throw a specific error subtype and catch it through a base-type handler, printing `caught base`. In Clojure, `ex-info` produces an `ExceptionInfo` caught by a handler for its supertype `RuntimeException`.

## Run

    clojure -M main.clj
