# 0030 — Variadic Functions

Define a function that accepts a variable number of integer arguments and returns their total, then call it with `1, 2, 3` to print `sum: 6`. An `& nums` rest parameter binds the remaining arguments as a sequence, which `(apply + nums)` folds. `apply` is also how you call a variadic function with a ready-made collection.

## Run

    clojure -M main.clj
