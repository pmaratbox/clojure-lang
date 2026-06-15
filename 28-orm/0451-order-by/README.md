# 0451 — Order by

Builds and runs queries with the `com.github.seancorfield/honeysql` query builder over an in-memory SQLite database. After inserting the three `users` rows via a HoneySQL `{:insert-into ...}` map, it selects every name ordered by `age` ascending using `{:select :name :from :users :order-by [[:age :asc]]}`, compiled with `honey.sql/format` and executed through the `next.jdbc` `execute!` API on a single `jdbc:sqlite::memory:` connection.

## Run

    clojure -M main.clj
