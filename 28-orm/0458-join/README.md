# 0458 — Join

Builds two in-memory SQLite tables (`users` and `posts`) and runs all inserts and the
join through the HoneySQL query builder (`honey.sql/format` on `{:insert-into ...}` and
`{:select ... :from ... :join ... :order-by ...}` maps), executed over a single
`next.jdbc` connection backed by the `org.xerial/sqlite-jdbc` driver. The query joins
`posts.user_id` to `users.id`, orders by `name` then `title`, and prints each
`name title` pair.

## Run

    clojure -M main.clj
