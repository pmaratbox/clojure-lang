# 0452 — Limit

Takes only the top N rows of a query. It builds a `select` map with `:order-by` and `:limit` keys using the HoneySQL query-builder DSL (`honey.sql/format`), then runs it with `next.jdbc/execute!` over a single `jdbc:sqlite::memory:` connection backed by the real `org.xerial/sqlite-jdbc` driver. The `users` rows are ordered by `age` descending and capped at 2, printing the two oldest names.

## Run

    clojure -M main.clj
