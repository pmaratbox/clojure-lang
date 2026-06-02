# 0036 — Inheritance & Overriding

Define a base `Animal` with a `speak` method, a `Dog` that overrides it, and call both, printing `animal: some sound` and `dog: Woof`. Clojure favors polymorphism over inheritance. A `defmulti`/`defmethod` *multimethod* dispatches on a value: the `:default` method supplies the base behavior and `:dog` overrides it. Protocols are the other (type-based) dispatch mechanism.

## Run

    clojure -M main.clj
