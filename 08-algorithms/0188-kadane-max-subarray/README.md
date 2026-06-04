# 0188 — Kadane Max Subarray

Find the maximum subarray sum of [-2,1,-3,4,-1,2,1,-5,4] with Kadane and print `6`. A `loop` tracks the running max(cur+x, x) and the best seen so far.

## Run

    clojure -M main.clj
