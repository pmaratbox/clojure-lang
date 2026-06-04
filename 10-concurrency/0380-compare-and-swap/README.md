# 0380 — Compare-And-Swap Loop

Increment a shared value to 100 using a CAS retry loop from multiple threads, printing `100`. A `loop`/`recur` retries `AtomicInteger.compareAndSet` until the increment succeeds.

## Run

    clojure -M main.clj
