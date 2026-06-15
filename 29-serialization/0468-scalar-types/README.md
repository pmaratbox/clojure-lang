# 0468 — Scalar types

Uses the [Cheshire](https://github.com/dakrone/cheshire) JSON library's
`cheshire.core/generate-string` to serialize a Clojure map of scalar values
(`active` boolean, `count` integer, `label` string) into compact JSON. The keys
are declared in an `array-map` literal in alphabetical order so the emitted JSON
has alphabetical keys, and Cheshire renders booleans in lowercase.

## Run

    clojure -M main.clj
