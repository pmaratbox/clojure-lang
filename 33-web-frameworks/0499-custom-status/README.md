# 0499 — Custom status

A Compojure/Ring route that returns a custom HTTP status code. The `POST /create`
handler returns a response map with `:status 201` (Created) instead of the default
`200`. The route is exercised in-process by building a request with
`ring.mock.request/request` and calling the handler fn directly (no server bound,
no fixed port), then printing the real `(:status resp)` code from the response.

## Run

    clojure -M main.clj
