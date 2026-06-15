# 0461 — Nested object

Uses the [Cheshire](https://github.com/dakrone/cheshire) JSON library's
`cheshire.core/generate-string` to serialize a `Person` map that nests an
`Address` map. The keys are declared alphabetically in `array-map` literals
(`:address` before `:name`, `:city` before `:zip`), so Cheshire emits compact
JSON with alphabetically ordered keys for both the outer and nested objects.

## Run

    clojure -M main.clj
