# 0440 — Update & delete

Modify and remove rows, then read the result. This lesson creates an in-memory SQLite database with the xerial sqlite-jdbc driver via next.jdbc, inserts three users, runs an `update` to rename the row with id 2 and a `delete` to remove the row with id 1, then selects the remaining rows ordered by id and prints each as `id name`.

## Run

    clojure -M main.clj
