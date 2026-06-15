# 0504 — Error handler

A Compojure/Ring app where the `GET /boom` handler throws a real exception, and
a Ring error-handling middleware (`wrap-error-handler`) catches the thrown
`Throwable` and turns it into an HTTP `500` response. The route is exercised
in-process by building a request with `ring.mock.request/request` and calling
the wrapped handler fn directly (no server bound, no fixed port), then printing
the real `(:status resp)` code that the framework's error handling produced.

## Run

    clojure -M main.clj
