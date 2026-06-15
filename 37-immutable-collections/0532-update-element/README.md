# 0532 — Update an element

Clojure's built-in vector is a persistent (immutable) collection. Calling `assoc` on a vector to set an index returns a brand-new vector while the original is left completely unchanged, demonstrating structural sharing without mutation.

## Run

    clojure -M main.clj
