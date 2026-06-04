# 0276 — Longest Common Substring

Find the longest common contiguous substring of "abcde" and "xbcdy", printing `bcd`. A rolling DP row tracks suffix-match runs while `loop`/`recur` records the best length and end.

## Run

    clojure -M main.clj
