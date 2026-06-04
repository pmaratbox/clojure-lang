# 0192 — Majority Element

Find the majority element of [2,2,1,2,3,2] using Boyer-Moore voting and print `2`. A `reduce` threads a candidate-and-count map, flipping the candidate when the count hits zero.

## Run

    clojure -M main.clj
