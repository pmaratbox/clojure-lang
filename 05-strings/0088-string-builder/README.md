# 0088 — String Builder

Use a string builder to assemble `1`, `2`, and `3` joined by `-`, printing `1-2-3`. Clojure builds strings with `str`/`join`, but for incremental building it uses a Java `StringBuilder` via interop (`.append`).

## Run

    clojure -M main.clj
