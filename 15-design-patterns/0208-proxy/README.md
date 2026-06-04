# 0208 — Virtual Proxy

Use a lazy virtual proxy that loads the real subject only on first access, printing `loaded`. An `atom` holding nil defers construction of the real subject until the first request.

## Run

    clojure -M main.clj
