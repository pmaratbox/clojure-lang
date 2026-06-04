# 0106 — Producer / Consumer

A producer sends 1..5 to a consumer that sums them, printing `15`. A bounded `LinkedBlockingQueue` blocks the producer when full while the consumer accumulates.

## Run

    clojure -M main.clj
