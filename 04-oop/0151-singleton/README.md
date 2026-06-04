# 0151 — Singleton

Obtain a singleton instance twice and confirm both references are the same object, printing `same: yes`. A `delay` lazily builds one shared value, and `identical?` confirms both fetches return that very object.

## Run

    clojure -M main.clj
