# 0225 — Recursive Descent Calculator

Parse and evaluate "2+3*4" honoring precedence, printing `14`. Clojure threads a `[value remaining-tokens]` pair through `loop`/`recur` parse functions.

## Run

    clojure -M main.clj
