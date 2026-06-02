# 0077 — Title Case

Convert `hello world` to title case (uppercase the first letter of each word) and print it: `Hello World`. `clojure.string/split` with the regex `#" "` breaks the text, and `clojure.string/capitalize` uppercases each word's first letter.

## Run

    clojure -M main.clj
