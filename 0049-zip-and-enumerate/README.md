# 0049 — Zip & Enumerate

Pair the letters `a, b, c` with the numbers `1, 2, 3` position by position, formatting each pair as `key=value` and printing `a=1 b=2 c=3`. `map` accepts multiple collections and applies the function across them in lockstep — `(map f letters nums)` — which is zip. Its enumerate counterpart, `map-indexed`, pairs items with their index.

## Run

    clojure -M main.clj
