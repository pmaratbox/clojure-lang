# 0446 — Indexes

Creates an in-memory SQLite `products` table through `next.jdbc` (with the
`org.xerial/sqlite-jdbc` driver), inserts three rows, then executes a real
`create index idx_sku on products(sku)` statement. It then runs a parameterized
lookup `select price from products where sku=?` bound to `'B'`, which the index
can serve, and prints the resulting price. All work runs over a single JDBC
connection obtained from the `jdbc:sqlite::memory:` datasource.

## Run

    clojure -M main.clj
