# 0397 — Log Level Filter

With a threshold of WARN, log messages at INFO, WARN, and ERROR but only emit WARN and ERROR, on two lines. A map ranks levels and `when` suppresses anything below the threshold.

## Run

    clojure -M main.clj
