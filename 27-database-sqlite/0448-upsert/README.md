# 0448 — Upsert

Insert or update a row on primary-key conflict. This lesson creates an in-memory SQLite database with the xerial sqlite-jdbc driver via next.jdbc, creates an `inv` table keyed by `item`, inserts `('apple',5)`, then upserts `('apple',5)` and `('banana',3)` using `insert ... on conflict(item) do update set qty=qty+excluded.qty` so apple accumulates to 10 while banana is inserted fresh, then selects all rows ordered by item and prints each as `item qty`.

## Run

    clojure -M main.clj
