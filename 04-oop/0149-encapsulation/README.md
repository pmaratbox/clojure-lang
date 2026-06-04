# 0149 — Encapsulation

Keep an account balance private, deposit 50 onto an initial 100 through a method, and print `150`. An atom holds the private state and `swap!` is the only way to mutate it, modelling encapsulation functionally.

## Run

    clojure -M main.clj
