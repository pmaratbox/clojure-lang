# 0498 — 404 status

A Compojure (Ring) route table whose `route/not-found` fallback turns any
unmatched path into a real `404` response. The handler is exercised in-process
with `ring.mock.request`: we build a mock `GET /missing` request and call the
handler function directly, then print the `:status` from the returned HTTP
response map. No server is started and no port is bound.

## Run

    clojure -M main.clj
