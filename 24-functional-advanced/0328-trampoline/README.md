# 0328 — Trampoline

Sum 1..100 with a trampolined recursion that avoids deep stacks, printing `5050`. Each step returns a thunk and `trampoline` drives them in a loop, so the stack never grows.

## Run

    clojure -M main.clj
