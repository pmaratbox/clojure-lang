# 0045 — Abstract Classes & Methods

Define an abstract `Shape` with an abstract `area` and a concrete `describe` that uses it, then implement a `Square` of side 3 and print `area: 9`. Clojure favors protocols over inheritance: the `Shape` protocol declares `area`, a plain `describe` function provides shared behavior, and the `Square` record implements `area`.

## Run

    clojure -M main.clj
