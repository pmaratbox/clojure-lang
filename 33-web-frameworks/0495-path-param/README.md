# 0495 — Path parameter

Uses Compojure (Ring's routing library) to define `GET /users/:id`, capturing the `:id` path parameter via Compojure's destructuring binding; the handler echoes the id. The route is exercised in-process by calling the Ring handler directly with a `ring.mock.request` map for `/users/42` (no port is bound), and the response `:body` is printed.

## Run

    clojure -M main.clj
