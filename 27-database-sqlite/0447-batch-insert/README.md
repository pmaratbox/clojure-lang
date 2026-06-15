# 0447 — Batch insert

Inserts 1000 rows (values 1..1000) into an in-memory SQLite table using a single
prepared statement and `next.jdbc.prepare/execute-batch!` inside one transaction,
then runs `select count(*)` and prints the count. Uses the `next.jdbc` API over
the real `org.xerial/sqlite-jdbc` driver.

## Run

    clojure -M main.clj
