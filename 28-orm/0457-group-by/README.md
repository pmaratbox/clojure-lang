# 0457 — Group by

Builds queries for an in-memory SQLite database with the HoneySQL query builder,
executed through `next.jdbc` (with the `org.xerial/sqlite-jdbc` driver). A
`products` table is populated with `:insert-into` maps, then a
`{:select ... :group-by [:category] :order-by [:category]}` map (using the
`[:sum :price]` aggregate) is compiled by `honey.sql/format` and run via
`jdbc/execute!` to sum prices per category. Each result row is printed as
`category sum` (space-separated).

## Run

    clojure -M main.clj
