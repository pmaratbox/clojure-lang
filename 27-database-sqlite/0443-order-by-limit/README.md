# 0443 — Order by & limit

Sort rows in descending order and take only the top few. This lesson creates an in-memory SQLite database with the xerial sqlite-jdbc driver via next.jdbc, inserts six integer scores, then runs `select value from scores order by value desc limit 3` and prints each of the three highest values on its own line.

## Run

    clojure -M main.clj
