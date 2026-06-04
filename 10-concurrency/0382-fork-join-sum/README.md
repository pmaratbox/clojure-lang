# 0382 — Fork-Join Sum

Recursively fork the sum of [1..8] into halves and join the partial sums, printing `36`. Each half is computed in a `future`, and `deref` joins the partial sums back together.

## Run

    clojure -M main.clj
