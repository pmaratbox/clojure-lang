# 0463 — Array of primitives

Uses the Cheshire JSON library (`cheshire.core/generate-string`) to serialize a Clojure
vector of integers `[1 2 3]` into a compact JSON array. A sequential collection maps directly
to a JSON array, and Cheshire emits it with no extra whitespace.

## Run

    clojure -M main.clj
