# 0327 — FlatMap

FlatMap [1,2,3] with x -> [x, x*10] and print the flattened result `1 10 2 20 3 30`. `mapcat` is Clojure's flatMap: it maps each element to a seq and concatenates the results.

## Run

    clojure -M main.clj
