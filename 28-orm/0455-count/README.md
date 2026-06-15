# 0455 — Count

This lesson counts rows with the HoneySQL query builder over an in-memory SQLite database accessed through next.jdbc and the xerial sqlite-jdbc driver. After inserting three users via HoneySQL `:insert-into` maps, it builds a `{:select [[[:count :*]]] :from :users}` map, formats it with `honey.sql/format`, runs it with `next.jdbc/execute!`, and prints the scalar count read via `(val (first row))`.

## Run

    clojure -M main.clj
