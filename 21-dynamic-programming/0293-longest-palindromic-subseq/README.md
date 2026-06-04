# 0293 — Longest Palindromic Subsequence

Compute the longest palindromic subsequence length of "bbbab", printing `4`. A `reduce` fills the substring DP table by descending `i`, ascending `j` via `assoc-in`/`get-in`.

## Run

    clojure -M main.clj
