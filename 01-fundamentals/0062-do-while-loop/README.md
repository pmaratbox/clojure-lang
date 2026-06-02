# 0062 — Do-While Loop

Use a do-while loop (whose body runs once before the condition is checked) to print `1`, `2`, and `3` on one line: `1 2 3`. Clojure has no do-while loop; `loop`/`recur` appends to the accumulator (the body) before testing `(< i 3)`, giving the do-while shape — the body always runs once.

## Run

    clojure -M main.clj
