# 0178 — Stack With Min

Build a stack that tracks its minimum in O(1); after pushing 3,1,2 print `min: 1`. A second `:mins` vector that records the running minimum at each push keeps `get-min` to a single `peek`.

## Run

    clojure -M main.clj
