# 0445 — Transactions

Creates an in-memory SQLite table `t` through `next.jdbc` (with the
`org.xerial/sqlite-jdbc` driver) and demonstrates real transaction control on a single
JDBC connection. With auto-commit disabled, the first transaction inserts `1` and `2` and
calls `commit`; the second transaction inserts `3` and calls `rollback`, discarding it.
A final `select n from t order by n` prints each surviving value, showing only `1` and `2`.

## Run

    clojure -M main.clj
