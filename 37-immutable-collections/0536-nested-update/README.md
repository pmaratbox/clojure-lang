# 0536 — Nested update

Clojure's persistent (immutable) hash maps support nested updates via `assoc-in`, which walks a key path and returns a brand-new map sharing structure with the original. We build `{:user {:age 30}}`, then `(assoc-in m [:user :age] 31)` returns a new map; the original map is untouched, so reading its nested age still yields `30`.

## Run

    clojure -M main.clj
