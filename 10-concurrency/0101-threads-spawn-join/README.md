# 0101 — Threads: Spawn and Join

Spawn 3 worker threads, wait for all of them to finish, then print `done: 3`. A `future` spawns work on a thread pool and `deref` joins it.

## Run

    clojure -M main.clj
