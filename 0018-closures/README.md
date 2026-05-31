# 0018 — Closures

Build a counter that captures a private count starting at zero; each call to the returned function increments the count and returns it, so calling it twice prints 1 then 2. Clojure locals are immutable, so the closure captures an `atom` — a managed, thread-safe reference cell — instead of a bare number. `swap!` applies `inc` to the atom's current value and returns the new one, so each call to the returned function advances and reports the count. The atom is private to the closure, reachable only through it.

## Run

    clojure -M main.clj
