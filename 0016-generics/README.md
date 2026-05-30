# 0016 — Generics

Define a generic `first` function that returns the first element of a list, then call it on a list of integers and a list of strings to show one definition working at two types. Clojure is dynamically typed, so there are no type parameters at all — `first-of` works on a sequence of anything by construction. The function is named `first-of` to avoid shadowing `clojure.core/first`, and the collections are bound as `nums`/`words` because `clojure.core/ints` is itself a function. Genericity here is a property of the dynamic runtime, not a declared signature.

## Run

    clojure -M main.clj
