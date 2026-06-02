# 0006 — Functions

Define `add(a, b)` returning their sum, call it with `3` and `4`, and print
the result. `defn` defines a named function; the parameter list is a vector
`[a b]`. The body's last expression is the return value — there is no
`return` keyword. Calling is just another list: `(add 3 4)`.

## Run

    clojure -M main.clj
