# 0060 — Priority Queue

Push `3`, `1`, and `2` into a min-priority-queue, then pop them all and print them in priority (ascending) order: `1 2 3`. Clojure has no stdlib priority queue, so this uses Java's `java.util.PriorityQueue` via interop (`.add` / `.poll`) — a binary min-heap.

## Run

    clojure -M main.clj
