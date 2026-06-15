# 0496 — Query parameter

Uses Compojure (Ring's routing library) to define `GET /greet`, with Ring's `wrap-params` middleware parsing the query string into the request `:params` map; the handler returns `hello ` + the `name` parameter. The route is exercised in-process by calling the Ring handler directly with a `ring.mock.request` map carrying the `?name=alice` query string (no port is bound), and the response `:body` is printed.

## Run

    clojure -M main.clj
