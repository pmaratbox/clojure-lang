# 0116 — Function Pipeline

Compose inc, double, and negate into a left-to-right pipeline and apply it to 3: ((3+1)*2) negated = `-8`. Clojure's `comp` runs right-to-left, so listing the stages in reverse yields a left-to-right pipeline.

## Run

    clojure -M main.clj
