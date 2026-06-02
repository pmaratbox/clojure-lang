# 0029 — Bitwise Operations

Compute bitwise AND, OR, and XOR on `6` and `3`, plus a left shift of `6` by one bit, printing `and: 2`, `or: 7`, `xor: 5`, and `shift: 12`. Clojure spells the bit operations as functions: `bit-and`, `bit-or`, `bit-xor`, and `bit-shift-left` (plus `bit-not`, `bit-shift-right`). They operate on `long`s; `(bit-shift-left 6 1)` doubles to 12.

## Run

    clojure -M main.clj
