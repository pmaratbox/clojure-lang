# 0211 — Command (Undo)

Execute an AddCommand that takes a counter from 0 to 5, then undo it back to 0, printing `5 0`. The command is a map of `:execute`/`:undo` thunks that `swap!` an atom counter.

## Run

    clojure -M main.clj
