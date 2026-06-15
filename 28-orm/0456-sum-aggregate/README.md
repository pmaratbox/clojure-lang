# 0456 — Sum aggregate

Inserts the `users` rows `(1,alice,30)`, `(2,bob,25)`, `(3,carol,35)` into an in-memory SQLite database, then sums the `age` column and prints the total (`90`). The query is built with the `com.github.seancorfield/honeysql` query builder (`honey.sql/format` on a `{:select :from}` map using the `[[[:sum :age]]]` aggregate clause) and executed through the `next.jdbc` API over a single `jdbc:sqlite::memory:` connection.

## Run

    clojure -M main.clj
