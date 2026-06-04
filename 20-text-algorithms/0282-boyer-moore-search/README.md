# 0282 — Boyer-Moore Search

Use the bad-character rule to find "abc" in "zzabc", printing the index `2`. `reduce` precomputes the last-occurrence map and `loop`/`recur` slides the pattern by the bad-character shift.

## Run

    clojure -M main.clj
