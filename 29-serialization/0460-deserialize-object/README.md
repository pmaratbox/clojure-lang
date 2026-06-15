# 0460 — Deserialize an object

Uses Cheshire's `parse-string` (the real Clojure JSON library wrapping Jackson) to
deserialize the JSON object `{"age":30,"name":"alice"}` into a typed Person-shaped map.
Passing `true` as the second argument converts the JSON keys into Clojure keywords, so the
fields are read back as `:name` and `:age`.

## Run

    clojure -M main.clj
