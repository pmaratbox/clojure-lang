# 0199 — Struct Field Names

List the field names of a Point{x,y} struct/record and print `x y`. A Clojure `defrecord` behaves like a map, so `keys` on an instance yields its fields in declaration order.

## Run

    clojure -M main.clj
