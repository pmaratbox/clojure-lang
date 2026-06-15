# 0453 — Update a row

Modifies a persisted entity. It builds an `update` map with `:set` and `:where` keys using the HoneySQL query-builder DSL (`honey.sql/format`) to change bob's age to 40, then runs it with `next.jdbc/execute!` over a single `jdbc:sqlite::memory:` connection backed by the real `org.xerial/sqlite-jdbc` driver. A follow-up `select` filtered with `:where [:>= :age 35]` and ordered by `id` prints each surviving `name age` pair.

## Run

    clojure -M main.clj
