# 0010 — Structs

Define a `Person` type with a `name` and an `age`, create one ("Ada", 36), and
print each field. `defrecord` creates a named type with a positional constructor
(`->Person`) whose fields are accessed by keyword (`(:name p)`). A record
behaves like a map but carries a concrete type; a plain map is the looser
alternative.

## Run

    clojure -M main.clj
