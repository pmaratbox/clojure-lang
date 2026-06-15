# 0441 — Aggregate functions

Compute several aggregate values in a single query. This lesson creates an in-memory SQLite database with the xerial sqlite-jdbc driver via next.jdbc, inserts five amounts, and runs `select count(*),sum(amount),min(amount),max(amount) from t`, printing the count, sum, minimum, and maximum each on its own line.

## Run

    clojure -M main.clj
