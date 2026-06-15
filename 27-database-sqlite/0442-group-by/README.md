# 0442 — Group by

Creates an in-memory SQLite `sales` table through `next.jdbc` (with the
`org.xerial/sqlite-jdbc` driver), inserts category/amount rows using parameterized
inserts over one JDBC connection, then runs `select category,sum(amount) from sales
group by category order by category` to aggregate the amounts per category. Each
result row is printed as `category sum` (space-separated).

## Run

    clojure -M main.clj
