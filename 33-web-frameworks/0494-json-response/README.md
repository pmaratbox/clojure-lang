# 0494 — JSON response

A Compojure/Ring route that returns a JSON body. The handler builds the body
with Cheshire's `generate-string` and sets the `application/json` content type.
The route is exercised in-process by calling the handler fn directly with a
`ring.mock.request` map (no server bound, no fixed port), then printing
`(:body resp)`.

## Run

    clojure -M main.clj
