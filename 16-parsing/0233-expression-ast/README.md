# 0233 — Expression AST

Build an AST for "1+2*3" and evaluate it to `7`. Clojure represents nodes as vectors `[op left right]` and recurses with a `number?` base case.

## Run

    clojure -M main.clj
