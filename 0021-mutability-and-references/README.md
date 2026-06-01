# 0021 — Mutability & References

Have a function increment a value in place — through a pointer, reference, or mutable holder — so the caller sees it change from `before: 1` to `after: 2`. Clojure values are immutable, so there is no in-place mutation of a local. Mutable state lives in managed reference types — here an `atom` — and changes go through `swap!`, which applies a function (`inc`) atomically; `@counter` dereferences the current value.

## Run

    clojure -M main.clj
