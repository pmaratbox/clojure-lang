# 0415 — SwitchMap

Implement switchMap: when a new outer value arrives, cancel the previous inner subscription before starting the new one. An atom holds the current inner's scheduler tokens so the next outer value can cancel them.

## Run

    clojure -M main.clj
