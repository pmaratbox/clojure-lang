# 0229 — Parse INI

Parse the INI text with section [s] and key k=v, printing the flattened entry `s.k=v`. Clojure tracks the current section through `loop`/`recur` and emits `section.key=value`.

## Run

    clojure -M main.clj
