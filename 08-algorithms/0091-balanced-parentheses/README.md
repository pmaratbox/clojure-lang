# 0091 — Balanced Parentheses

Using a stack, check whether `(())` is balanced and whether `(()` is balanced, printing `yes` then `no`. A `loop`/`recur` carries an immutable vector stack — `conj` on `(`, `pop` on `)` — and balance means the stack is empty when the input ends.

## Run

    clojure -M main.clj
