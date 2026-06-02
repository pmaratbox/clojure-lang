# 0038 — String Methods

Split `"a,b,c"` on commas, upper-case each part, and join them with `-`, printing `A-B-C`. `clojure.string/split` takes a regex (`#","`) and returns a vector, `map` applies `upper-case` lazily, and `join` recombines with the separator. All operate on immutable Java strings.

## Run

    clojure -M main.clj
