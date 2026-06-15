# 0464 — Optional field default

Uses Cheshire's `parse-string` (the standard Clojure JSON library, backed by Jackson) to
deserialize `{"name":"alice"}` in which the `age` field is absent. Since parsing yields a
plain Clojure map, the optional/default behaviour is expressed with `(get parsed :age 0)`,
supplying `0` when the key is missing, then prints `name age`.

## Run

    clojure -M main.clj
