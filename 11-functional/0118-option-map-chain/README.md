# 0118 — Option Map Chaining

Map a function over a present optional (10 -> 12) and an absent one (-> fallback), printing `12 none`. Clojure models an absent optional with `nil`, so mapping skips it and `or` supplies the fallback.

## Run

    clojure -M main.clj
