# 0085 — Rotate a List

Rotate the list `1, 2, 3, 4, 5` left by `2` positions (elements wrap to the end) and print it: `3 4 5 1 2`. `concat` of `(drop k nums)` and `(take k nums)` rotates left; both are lazy sequence operations.

## Run

    clojure -M main.clj
