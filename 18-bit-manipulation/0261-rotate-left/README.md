# 0261 — Rotate Left (8-bit)

Rotate the 8-bit value 1 left by 1 (->2) and 128 left by 1 (->1), printing `2 1`. A small `rol8` fn combines the shifted halves and masks to 8 bits with `(bit-and … 0xff)`.

## Run

    clojure -M main.clj
