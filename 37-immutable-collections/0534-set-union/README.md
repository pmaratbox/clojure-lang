# 0534 — Set union

Clojure's persistent set (`#{}`) is immutable. `clojure.set/union` combines two
sets and RETURNS A NEW set, leaving the original sets unchanged. We compute the
union of `#{1 2 3}` and `#{3 4 5}`, then print its elements sorted and
space-joined for deterministic output.

## Run

    clojure -M main.clj
