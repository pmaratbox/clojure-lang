# 0535 — Prepend & append

Clojure's persistent vector (`clojure.lang.PersistentVector`) is immutable.
Starting from `[2 3]`, `conj` appends `4` to the tail and `into [1]` prepends
`1` to the head; each operation returns a brand-new vector via structural
sharing while the original `[2 3]` stays unchanged. The final vector is printed
space-joined: `1 2 3 4`.

## Run

    clojure -M main.clj
