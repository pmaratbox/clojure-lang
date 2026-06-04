# 0125 — Temp File Roundtrip

Write a string to a temporary file, read it back, confirm it matches, delete the file, and print `roundtrip: ok`. Use `File/createTempFile` with `spit`/`slurp` for the roundtrip.

## Run

    clojure -M main.clj
