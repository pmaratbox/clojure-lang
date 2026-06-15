# 0497 — POST JSON body

A Compojure/Ring route that parses a JSON request body. The `POST /sum` handler
reads the raw `:body` input stream, parses it with Cheshire's `parse-stream`,
adds the two numbers, and returns the sum as the response body. The route is
exercised in-process by building a request with `ring.mock.request/json-body`
and calling the handler fn directly (no server bound, no fixed port), then
printing `(:body resp)`.

## Run

    clojure -M main.clj
