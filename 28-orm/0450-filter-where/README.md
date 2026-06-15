# 0450 — Filter with where

Inserts the `users` rows `(1,alice,30)`, `(2,bob,25)`, `(3,carol,35)` into an in-memory SQLite database, then queries the names where `age >= 30` ordered by id and prints each on its own line. Queries are built with the `com.github.seancorfield/honeysql` query builder (`honey.sql/format` on a `{:select :where :order-by}` map, using the `[:>= :age 30]` filter clause) and executed through the `next.jdbc` API over a single `jdbc:sqlite::memory:` connection.

## Run

    clojure -M main.clj
