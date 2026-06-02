# 0032 — Math Functions

Take the square root of `16`, raise `2` to the 10th power, the absolute value of `-5`, and the larger of `3` and `9`, printing `sqrt: 4`, `pow: 1024`, `abs: 5`, and `max: 9`. Clojure calls Java's `Math` via interop — `(Math/sqrt 16)` and `(Math/pow 2 10)` return doubles (coerced with `int`), and `(Math/abs -5)` is integer — while `max` is a core function. `Math/pow` is floating-point; for exact integer math that auto-promotes past `long`, use the apostrophe operators like `*'` (plain `*` is fixed-width and throws on overflow).

## Run

    clojure -M main.clj
