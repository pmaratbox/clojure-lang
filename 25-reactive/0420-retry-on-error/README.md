# 0420 — Retry On Error

Implement retry(n) that resubscribes to the source on error up to n times; the source succeeds on the 3rd subscription. A recursive closure with an atom counts remaining retries and resubscribes the source on each error.

## Run

    clojure -M main.clj
