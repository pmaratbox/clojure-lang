# 0284 — Trie Autocomplete

Insert "car","card","dog" into a trie and autocomplete the prefix "car", printing `car card`. Nested maps built with `assoc-in` form the trie and a recursive `collect` DFS gathers words in sorted order.

## Run

    clojure -M main.clj
