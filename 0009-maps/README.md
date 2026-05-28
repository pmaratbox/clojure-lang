# 0009 — Maps

Build a map `{"one" 1, "two" 2, "three" 3}`, look up `"two"`, and print its
value and the map's size. Commas are optional whitespace. `(get m key)` reads a
value; maps are also functions, so `(m "two")` works too (and with keyword
keys, `(:key m)` is idiomatic). `count` returns the number of entries.

## Run

    clojure -M main.clj
