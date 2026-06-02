# 0074 — Run-Length Encoding

Run-length encode the string `aaabbc` (each run of a repeated character becomes the character followed by its count), printing `a3b2c1`. `partition-by identity` groups consecutive equal characters into runs; each run becomes `[char count]`, flattened by `mapcat` and joined.

## Run

    clojure -M main.clj
