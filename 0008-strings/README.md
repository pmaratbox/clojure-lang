# 0008 — Strings

Given `name = "world"`, print a greeting, the name in uppercase, and its
length. There is no string interpolation — `(str ...)` concatenates its
arguments. Uppercasing lives in the `clojure.string` namespace
(`clojure.string/upper-case`), and `count` returns the character count. `name`
is bound with `let` to avoid shadowing the built-in `clojure.core/name`.

## Run

    clojure -M main.clj
