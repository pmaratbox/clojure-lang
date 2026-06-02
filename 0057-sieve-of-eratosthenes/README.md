# 0057 — Sieve of Eratosthenes

Use the Sieve of Eratosthenes to find every prime number up to `10` and print them: `2 3 5 7`. The boolean vector is updated functionally: `reduce` with `assoc` produces a new vector with each multiple struck, threaded through `loop`/`recur`; `filter` then keeps the primes.

## Run

    clojure -M main.clj
