# 0170 — Index By Key

Index people [(1,alice),(2,bob)] by id into a map, look up id 2, and print `id 2: bob`. Building `{id name}` with `into` and `juxt` gives an O(1) lookup map.

## Run

    clojure -M main.clj
