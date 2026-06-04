# 0299 — Floyd-Warshall

Run all-pairs shortest paths on 0->1(3),1->2(1),0->2(5) and print the distance from 0 to 2 `4`. Idiomatic Clojure nests three `reduce` passes over a persistent matrix with `assoc-in`/`get-in`.

## Run

    clojure -M main.clj
