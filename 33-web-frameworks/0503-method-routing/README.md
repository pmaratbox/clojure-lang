# 0503 — Method routing

Two Compojure (Ring) routes share the same path `/item` but differ by HTTP
method: `GET /item` returns `get` and `POST /item` returns `post`. Compojure
dispatches on the request method, so the same path resolves to a different
handler. The route is exercised in-process with `ring.mock.request` — we build a
mock `POST /item` request, call the handler function directly, and print the
`:body` of the returned response map. No server is started and no port is bound.

## Run

    clojure -M main.clj
