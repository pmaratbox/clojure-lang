# 0462 — Array of objects

Serializes a vector of person maps to a single compact JSON array using the
[Cheshire](https://github.com/dakrone/cheshire) library's `cheshire.core/generate-string`.
Each person is an `array-map` whose keys are declared in alphabetical order
(`:age` before `:name`), so the emitted JSON has alphabetical keys with no extra
whitespace.

## Run

    clojure -M main.clj
