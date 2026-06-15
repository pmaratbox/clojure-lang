# 0530 — Immutable map

Clojure's built-in persistent map (`clojure.lang.PersistentArrayMap`) is immutable: `assoc` sets a key by RETURNING A NEW map, leaving the original `{:a 1}` unchanged. We add `:b` to a copy, then print the new map's keys and the original's keys (both sorted, space-joined) to show the original was never mutated.

## Run

    clojure -M main.clj
