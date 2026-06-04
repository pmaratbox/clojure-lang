# 0209 — Observer

Notify two observers of a new value 5; each prints its id and the value on its own line. Observers are closures over their id, and `doseq` fans the notification out in registration order.

## Run

    clojure -M main.clj
