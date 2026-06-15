# 0439 — Parameterized query

Bind a parameter to a query safely instead of concatenating strings. This lesson creates an in-memory SQLite database with the xerial sqlite-jdbc driver via next.jdbc, inserts three users, and runs `select name from users where id=?` with the bound parameter value `2`, printing the matched name.

## Run

    clojure -M main.clj
