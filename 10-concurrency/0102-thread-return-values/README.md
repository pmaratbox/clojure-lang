# 0102 — Threads Returning Values

Run two threads that compute the squares of 3 and 4, join them, and print the sum of their results `25`. A `future` returns its body's value, retrieved by `deref`.

## Run

    clojure -M main.clj
