# 0307 — A* on a Grid

Find the shortest path length from (0,0) to (2,2) on an obstacle-free 3x3 grid (4-directional) with the Manhattan heuristic, printing `4`. Idiomatic Clojure keeps the open set and g-scores as immutable maps, picking the lowest f-score with `min-key`.

## Run

    clojure -M main.clj
