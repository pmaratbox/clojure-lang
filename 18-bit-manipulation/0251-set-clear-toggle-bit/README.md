# 0251 — Set, Clear, Toggle Bit

On bit position 1: set it on 0 (->2), clear it on 2 (->0), toggle it on 0 (->2), printing `2 0 2`. Clojure's `bit-or`, `bit-and`/`bit-not`, and `bit-xor` core fns express the three operations directly.

## Run

    clojure -M main.clj
