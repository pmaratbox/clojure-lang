# 0108 — Parallel Tasks Combined

Run two independent tasks that produce 10 and 20 concurrently, then combine (sum) their results into `30`. Two `future` tasks run in parallel and `deref` joins them before combining.

## Run

    clojure -M main.clj
