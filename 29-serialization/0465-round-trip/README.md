# 0465 — Round trip

Uses the Cheshire JSON library (`cheshire.core`) to round-trip a value: `generate-string`
serializes a Person map (keys `:age`, `:name` in alphabetical order) into compact JSON, then
`parse-string` with the keyword-keys flag deserializes that JSON back into a Clojure map.
The recovered `:name` is printed, demonstrating both serialize and parse directions through
the real library.

## Run

    clojure -M main.clj
