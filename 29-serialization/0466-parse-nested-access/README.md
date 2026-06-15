# 0466 — Parse & access nested

Parses a JSON string into a Clojure data tree with `cheshire.core/parse-string`
from the [Cheshire](https://github.com/dakrone/cheshire) library (passing `true`
so map keys become keywords), then reads a deeply nested value (`user.name`) and
the first element of the nested `roles` array using `get-in` and `first` on the
parsed result.

## Run

    clojure -M main.clj
