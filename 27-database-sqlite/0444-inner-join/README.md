# 0444 — Inner join

Creates two in-memory SQLite tables (`users` and `orders`) through `next.jdbc` (with the
`org.xerial/sqlite-jdbc` driver), inserts a few rows into each, then runs an inner join
matching `orders.user_id` to `users.id` and prints each `name item` pair ordered by name
then item. All work runs over a single JDBC connection obtained from the
`jdbc:sqlite::memory:` datasource.

## Run

    clojure -M main.clj
