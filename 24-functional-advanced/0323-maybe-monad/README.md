# 0323 — Maybe Monad

Chain Maybe operations: Some(2) then +3 then *2 gives 10, and a None chain yields the fallback, printing `10 none`. A tagged map plus a `bind` that short-circuits on `:none` models the Maybe monad without macros.

## Run

    clojure -M main.clj
