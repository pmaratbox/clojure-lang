# 0179 — Union-Find

Union (0,1) and (2,3), then query connectivity of (0,1)=yes and (0,2)=no, printing `yes no`. A map of parent links threaded through `union` calls makes a purely functional disjoint-set whose `find-root` recurses to the representative.

## Run

    clojure -M main.clj
