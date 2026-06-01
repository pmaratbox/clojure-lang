# 0031 — Type Conversion & Parsing

Parse the string `"42"` into an integer and `"3.5"` into a float, then convert the integer back to a string, printing `int: 42`, `float: 3.5`, and `str: 42`. Clojure leans on Java interop for parsing — `(Integer/parseInt "42")` and `(Double/parseDouble "3.5")` — and `str` for the reverse. `read-string` can also parse, but it evaluates Clojure syntax, so it is unsafe on untrusted input.

## Run

    clojure -M main.clj
