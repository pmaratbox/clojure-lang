# 0041 — Command-line Arguments

Read the first command-line argument and greet it, so running with `Ada` prints `hello, Ada`. When running a script, Clojure binds the arguments to the `*command-line-args*` sequence; `(first *command-line-args*)` is the first one. It excludes the script path.

## Run

    clojure -M main.clj Ada
