# 0059 — Group By

Group the words `one`, `two`, `three` by their length and print each length with its words, in ascending order of length: `3:[one,two] 5:[three]`. `group-by count` returns a map of length to the vector of words in that group; `(sort (keys groups))` orders the keys for output.

## Run

    clojure -M main.clj
