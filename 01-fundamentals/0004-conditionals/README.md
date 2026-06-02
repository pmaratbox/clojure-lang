# 0004 — Conditionals

Compare `n` against 10 and print whether it's less, equal, or greater.
Clojure's `if` is binary (then-clause / else-clause only) so multi-way
branching uses `cond` — pairs of (condition, result), evaluated top to
bottom. The `:else` keyword (any truthy value works as catch-all) is the
default. Edit `n` to `10` or `15` to exercise the other branches.

## Run

    clojure -M main.clj
