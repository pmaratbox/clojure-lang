# 0467 — Field rename

Uses the [Cheshire](https://github.com/dakrone/cheshire) JSON library's `:key-fn`
option on `cheshire.core/generate-string` to rename a code-side field when
serializing. The idiomatic Clojure key `:full-name` is rewritten to the JSON key
`full_name` on the wire, producing compact JSON `{"full_name":"alice"}`.

## Run

    clojure -M main.clj
