# 0501 — Middleware

Uses the Compojure/Ring web framework. A Ring handler is just a function from
a request map to a response map, so middleware is a higher-order function that
wraps the handler. Here `wrap-prefix` calls the inner Compojure route, then
prefixes the response body with `[mw] `. The route is exercised in-process by
building a request with `ring.mock.request` and calling the wrapped handler
directly (no port is bound); the printed body comes from the actual response.

## Run

    clojure -M main.clj
