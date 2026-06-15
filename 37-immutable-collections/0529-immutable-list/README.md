# 0529 — Immutable list

Clojure's core vector (`clojure.lang.PersistentVector`) is a persistent, immutable collection. Calling `conj` to add `4` returns a brand-new vector while the original stays unchanged. We print the new vector space-joined (`1 2 3 4`), then the original (`1 2 3`) to prove immutability.

## Run

    clojure -M main.clj
