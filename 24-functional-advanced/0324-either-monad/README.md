# 0324 — Either Monad

Chain Either computations: a successful divide chain yields 2, and a divide-by-zero yields an error, printing `2 err`. `bind` propagates a `:left` unchanged, so the first error short-circuits the rest of the chain.

## Run

    clojure -M main.clj
