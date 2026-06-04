# 0272 — Glob Star Match

Match the glob "a*b" (* = any run) against "aaab" (yes) and "aac" (no), printing `yes no`. Recursive backtracking over the pattern and text sequences implements `*` as zero-or-more.

## Run

    clojure -M main.clj
