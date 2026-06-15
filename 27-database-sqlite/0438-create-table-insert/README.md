# 0438 — Create table & insert

Creates a `users(id integer, name text)` table in an in-memory SQLite database, inserts three rows with parameterized statements, then selects the names back ordered by id and prints each on its own line. It uses the real `org.xerial/sqlite-jdbc` driver through the `next.jdbc` API over a single `jdbc:sqlite::memory:` connection.

## Run

    clojure -M main.clj
