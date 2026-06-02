# 0023 — Modules & Imports

Define `square(n)` in a separate `mathutil` module and import it from the main program, printing `square(8) = 64` across the module boundary. Code is organized into namespaces: `mathutil.clj` declares `(ns mathutil)`, and `main.clj` declares `(ns main (:require [mathutil :refer [square]]))` to pull in `square` (the `:require` clause lives inside the `ns` form). The `deps.edn` with `:paths ["."]` puts the current directory on the classpath so the namespace file is found.

## Run

    clojure -M main.clj
