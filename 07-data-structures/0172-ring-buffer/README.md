# 0172 — Ring Buffer

Push 1,2,3,4,5 into a fixed capacity-3 ring buffer (overwriting oldest) and print the final contents `3 4 5`. An `atom` holding a vector plus a head index gives a tidy circular buffer whose writes wrap with `mod`.

## Run

    clojure -M main.clj
