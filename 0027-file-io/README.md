# 0027 — File I/O

Write `hello, file` to a file, read it back, delete the file, and print `read: hello, file`. `spit` writes a value to a file and `slurp` reads the whole file back as a string — both open and close the stream themselves — and `clojure.java.io/delete-file` removes it. They accept anything coercible to a file: a path string, `File`, or URL.

## Run

    clojure -M main.clj
