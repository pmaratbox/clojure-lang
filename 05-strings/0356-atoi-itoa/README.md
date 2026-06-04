# 0356 — String<->Int Round Trip

Parse "-42" to the integer -42 and format it back to "-42", printing `-42 -42`. A `reduce` accumulates digits for atoi and a `loop` peels digits with `quot`/`rem` for itoa.

## Run

    clojure -M main.clj
