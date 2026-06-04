# 0352 — ROT13

Apply ROT13 to "hello" (->"uryyb") and ROT13 again to recover "hello", printing `uryyb hello`. Rotating each letter by 13 with `mod` makes ROT13 its own inverse.

## Run

    clojure -M main.clj
