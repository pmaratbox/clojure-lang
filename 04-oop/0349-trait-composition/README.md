# 0349 — Trait Composition

Compose two capabilities (A printing "a", B printing "b") into one type and invoke both, printing `a b`. One defrecord can satisfy several protocols at once, mixing in both methods.

## Run

    clojure -M main.clj
