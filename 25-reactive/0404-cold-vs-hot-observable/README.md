# 0404 — Cold vs Hot Observable

Contrast a cold observable (re-runs its producer per subscriber) with a hot one (shares a single execution, so late subscribers miss earlier values). The cold source is a closure re-invoked per subscriber, while the hot source pushes to an atom holding the current observers.

## Run

    clojure -M main.clj
