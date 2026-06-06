# 0416 — Subject Multicast

Implement a Subject that multicasts each emission to all current observers; two observers both receive 1 then 2. An atom holds the observer vector and `doseq` fans each emission out to every subscriber.

## Run

    clojure -M main.clj
