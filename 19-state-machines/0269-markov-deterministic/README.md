# 0269 — Deterministic Transition Walk

Walk a deterministic transition map A->B->C->A for three steps from A, printing the visited states `B C A`. `iterate` over the transition map lazily produces the walk.

## Run

    clojure -M main.clj
