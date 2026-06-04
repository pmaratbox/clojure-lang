# 0283 — Rabin-Karp Search

Use rolling-hash Rabin-Karp to find all start indices of "ab" in "xabxab", printing `1 4`. `loop`/`recur` rolls a modular polynomial hash and verifies real matches with `subs`.

## Run

    clojure -M main.clj
