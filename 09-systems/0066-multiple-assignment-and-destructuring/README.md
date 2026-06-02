# 0066 — Multiple Assignment & Destructuring

Swap two variables (`a = 1`, `b = 2`) with a single multiple-assignment, then unpack the pair `(3, 4)` into two variables — printing `2 1` then `3 4`. `let` destructures vectors: `[a b] [b a]` rebinds the swapped values and `[x y] [3 4]` unpacks the pair (bindings evaluate in order).

## Run

    clojure -M main.clj
