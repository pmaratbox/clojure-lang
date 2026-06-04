# 0257 — Gray Code

Print the Gray code (as decimals) for 0..3 `0 1 3 2`. Mapping `(bit-xor n (bit-shift-right n 1))` over a range and `apply`-ing `println` keeps it lazy and concise.

## Run

    clojure -M main.clj
