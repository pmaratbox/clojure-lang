# 0262 — Parity Check

Compute the bit parity (XOR of all bits) of 7 (->1) and 5 (->0), printing `1 0`. `(bit-and (Long/bitCount n) 1)` derives parity from the popcount's low bit.

## Run

    clojure -M main.clj
