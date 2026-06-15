# 0531 — Immutable set

Clojure's native persistent set (`#{1 2 3}`) is immutable. `conj` adds an element by RETURNING A NEW set; the original is left unchanged. This prints the new set's size (`4`) and then the original's size (`3`), proving the original was not mutated.

## Run

    clojure -M main.clj
