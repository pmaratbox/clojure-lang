# 0144 — Flag Enum (Bit Flags)

Combine bit flags READ(1) and WRITE(2) into 3, check that WRITE is set, and print `3 yes`. Clojure exposes the JVM bitwise ops directly via `bit-or` and `bit-and`.

## Run

    clojure -M main.clj
