# 0459 — Serialize an object

Serializes a typed `Person` object (modelled as a Clojure map with `age` and `name`
keys) to a compact JSON string using `cheshire.core/generate-string` from the
[Cheshire](https://github.com/dakrone/cheshire) library. The keys are declared in
alphabetical order (`age` before `name`) so the emitted JSON is canonical: compact
(no spaces) with alphabetically ordered keys.

## Run

    clojure -M main.clj
