# 0449 — Define model & insert

Defines a `users(id, name, age)` model in an in-memory SQLite database, inserts three rows, then reads them back ordered by id and prints each name on its own line. Data operations are built with the `com.github.seancorfield/honeysql` query builder (`honey.sql/format` over `:insert-into` / `:select` maps) and executed with the `next.jdbc` API through the `org.xerial/sqlite-jdbc` driver over a single `jdbc:sqlite::memory:` connection.

## Run

    clojure -M main.clj
