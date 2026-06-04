# 0391 — URL Percent-Encode

Percent-encode the string "a b&c" to `a%20b%26c`. Clojure keeps unreserved chars and maps reserved ones to uppercase `%XX` via `format`.

## Run

    clojure -M main.clj
