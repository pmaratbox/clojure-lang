# 0068 — GCD (Euclid)

Compute the greatest common divisor of `48` and `36` with Euclid's algorithm (repeatedly replace the pair with `(b, a % b)` until the remainder is zero) and print it: `12`. `recur` tail-calls `gcd` with `(b, a mod b)`, looping without stack growth until `b` is zero.

## Run

    clojure -M main.clj
