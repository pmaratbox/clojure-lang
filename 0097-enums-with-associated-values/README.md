# 0097 — Enums with Associated Values

Define a shape type carrying associated data — `Rect(2, 3)` and `Square(4)` — compute each area by matching on the variant, and print `6` and `16`. Clojure uses tagged maps (a `:type` keyword plus the data); `case` on `:type` selects the variant.

## Run

    clojure -M main.clj
