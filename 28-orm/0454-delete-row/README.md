# 0454 — Delete a row

Remove a persisted entity. This lesson creates an in-memory SQLite database with the xerial sqlite-jdbc driver via next.jdbc, inserts three users, then builds a `:delete-from` map with HoneySQL (`honey.sql/format`) to remove the row with id 1. It then selects the remaining rows ordered by id and prints each name.

## Run

    clojure -M main.clj
