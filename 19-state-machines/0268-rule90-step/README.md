# 0268 — Cellular Automaton Rule 90

Apply one Rule 90 step (new = left XOR right) to the row "00100" with zero boundaries, printing `01010`. `bit-xor` over indexed neighbors with a zero-padded accessor expresses the rule directly.

## Run

    clojure -M main.clj
