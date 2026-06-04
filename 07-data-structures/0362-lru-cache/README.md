# 0362 — LRU Cache

With a capacity-2 LRU cache: put(1,1),put(2,2),get(1),put(3,3) evicts key 2; then get(1)=1 and get(2)=-1, printing `1 -1`. An `atom` holding a value map plus a recency vector keeps the least-recently-used key at the front for eviction.

## Run

    clojure -M main.clj
