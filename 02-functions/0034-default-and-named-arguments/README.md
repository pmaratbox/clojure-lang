# 0034 — Default & Named Arguments

Give a `greet` function a default greeting, then call it once without the greeting and once overriding it, printing `Hello, Ada` and `Hi, Ada`. Clojure functions have no default values, but *multiple arities* achieve the same effect: the one-argument body calls the two-argument body with the default. Keyword arguments are done with `& {:keys [...]}` destructuring.

## Run

    clojure -M main.clj
