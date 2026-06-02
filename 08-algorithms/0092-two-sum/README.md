# 0092 — Two Sum

Find the two indices in `2, 7, 11, 15` whose values sum to `9` and print them: `0 1`. `loop`/`recur` threads an immutable map of value to index; each step checks for the complement before adding the current value.

## Run

    clojure -M main.clj
