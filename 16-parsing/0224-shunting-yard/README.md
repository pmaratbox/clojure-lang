# 0224 — Shunting Yard

Convert the infix expression "3 + 4 * 2" to postfix `3 4 2 * +`. Clojure uses `loop`/`recur` with an operator stack and `split-with` to pop higher-precedence operators.

## Run

    clojure -M main.clj
