# 0502 — Multiple routes

Two Compojure (Ring) routes defined with `defroutes`/`GET`: `GET /` returns
`home` and `GET /about` returns `about`. Both are registered on the same router
and exercised in-process with `ring.mock.request` — we build a mock request for
each path, call the handler function directly, and print the `:body` of each
returned response map. No server is started and no port is bound.

## Run

    clojure -M main.clj
