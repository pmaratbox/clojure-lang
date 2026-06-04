# 0230 — Parse JSON Array

Parse the JSON array text "[1,2,3]" and print the sum of its elements `6`. Clojure strips the brackets, splits on commas, and `reduce`s the parsed longs.

## Run

    clojure -M main.clj
