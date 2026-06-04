# 0164 — Merge Maps

Merge {a:1,b:2} and {b:3,c:4} with the right map winning on conflicts, printing `a:1 b:3 c:4`. `merge` is right-biased, so later maps overwrite earlier keys.

## Run

    clojure -M main.clj
