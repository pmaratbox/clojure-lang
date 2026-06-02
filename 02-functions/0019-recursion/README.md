# 0019 — Recursion

Define a recursive `factorial(n)` that multiplies `n` by `factorial(n - 1)` until it bottoms out at `1`, then print `factorial(5) = 120`. `factorial` is an ordinary function that refers to itself by name; because the JVM has no tail-call optimization, genuinely deep recursion uses `recur` or `loop` instead. `println` inserts a space between its two arguments, producing `factorial(5) = 120`.

## Run

    clojure -M main.clj
