# 0113 — Result / Either Type

Model success and failure with a Result type: safeDiv(10,2) prints `ok: 5` and safeDiv(1,0) prints `err: divide by zero`. A tagged vector like `[:ok v]` / `[:err msg]` is destructured and matched with `case`.

## Run

    clojure -M main.clj
