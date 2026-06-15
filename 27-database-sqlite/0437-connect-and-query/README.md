# 0437 — Connect & query

Opens an in-memory SQLite database through `next.jdbc` (with the `org.xerial/sqlite-jdbc`
driver), runs the single query `select 42` over one JDBC connection, and prints the
resulting integer. The connection is obtained via `jdbc/get-connection` on a datasource
built from the `jdbc:sqlite::memory:` URL.

## Run

    clojure -M main.clj
