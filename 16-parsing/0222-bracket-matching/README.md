# 0222 — Bracket Matching

Check that mixed brackets are balanced: "([{}])" (yes) and "([)]" (no), printing `yes no`. Clojure uses a persistent list as the stack with `conj`/`pop`/`peek`.

## Run

    clojure -M main.clj
