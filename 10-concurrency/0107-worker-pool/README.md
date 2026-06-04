# 0107 — Worker Pool

Distribute squaring of 1..4 across a pool of workers, collect the results, and print them sorted ascending `1 4 9 16`. Each `future` runs on the shared agent thread pool; `sort` makes the gathered results deterministic.

## Run

    clojure -M main.clj
