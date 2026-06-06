# 0424 — Signal + Computed

Implement fine-grained reactivity: a writable signal and a derived computed that recomputes when its dependency changes. Closures over atoms model signals, and the computed subscribes a recompute callback that caches into its own atom.

## Run

    clojure -M main.clj
