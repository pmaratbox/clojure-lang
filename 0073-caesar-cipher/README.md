# 0073 — Caesar Cipher

Encrypt `abc` with a Caesar cipher shifting each letter forward by `1` (wrapping within the alphabet) and print the result: `bcd`. `(int ch)` and `(int \a)` give code points; the shift is wrapped with `mod` and turned back into a character with `char`.

## Run

    clojure -M main.clj
