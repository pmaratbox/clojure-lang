# 0121 — Parse CSV

Parse the two CSV rows `alice,30` and `bob,25` into name=value pairs and print `alice=30 bob=25`. Split each row on the comma with `re-seq` and rebuild as `name=value`.

## Run

    clojure -M main.clj
