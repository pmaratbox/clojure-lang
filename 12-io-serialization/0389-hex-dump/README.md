# 0389 — Hex Dump

Print the bytes of "Hi" as lowercase hex `48 69`. Clojure maps `format "%02x"` over the byte array and joins with `interpose`.

## Run

    clojure -M main.clj
