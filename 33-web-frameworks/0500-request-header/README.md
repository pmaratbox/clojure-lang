# 0500 — Request header

A Compojure (Ring) route defined with `defroutes`/`GET` that reads the
`X-Name` request header and echoes its value for `GET /whoami`. Ring exposes
headers under the request map's `:headers` key (lower-cased), so the handler
returns `(get-in req [:headers "x-name"])`. The route is exercised in-process
with `ring.mock.request`: we build a mock request, attach the header with
`mock/header`, call the handler function directly, and print the `:body` of the
returned response map. No server is started and no port is bound.

## Run

    clojure -M main.clj
