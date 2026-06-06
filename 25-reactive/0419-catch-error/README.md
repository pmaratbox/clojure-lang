# 0419 — Catch Error

Implement catchError that, on an error from the source, switches to a fallback stream. Observers are plain maps of :next/:error/:complete closures, and catch-error swaps in the fallback subscription on error.

## Run

    clojure -M main.clj
