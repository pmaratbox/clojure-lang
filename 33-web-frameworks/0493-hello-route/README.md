# 0493 — Hello route

A Compojure (Ring) route defined with `defroutes`/`GET` that returns the text
`hello` for `GET /`. The handler is exercised in-process with `ring.mock.request`:
we build a mock request and call the handler function directly, then print the
`:body` of the returned response map. No server is started and no port is bound.

## Run

    clojure -M main.clj
