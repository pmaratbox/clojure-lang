# 0256 — Hamming Distance

Compute the bit Hamming distance between 1 and 4, printing `2`. Clojure reaches straight into the JVM's `Long/bitCount` to popcount the XOR.

## Run

    clojure -M main.clj
