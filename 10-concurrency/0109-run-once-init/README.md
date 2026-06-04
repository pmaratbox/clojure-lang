# 0109 — Run-Once Initialization

Ensure an initializer runs exactly once even when several threads race to trigger it, printing `init count: 1`. A `delay` runs its body at most once and caches the result, even under concurrent `deref`.

## Run

    clojure -M main.clj
