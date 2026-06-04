# 0273 — KMP Search

Use Knuth-Morris-Pratt to find all start indices of "ab" in "ababab", printing `0 2 4`. Tail-recursive `loop`/`recur` scans the text while the prefix-function array drives backtracking.

## Run

    clojure -M main.clj
