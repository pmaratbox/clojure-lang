# 0200 — Precondition Assert

Check a precondition arg>0: for 5 print `ok`, and for -1 report the failure `error: must be positive`, on two lines. Clojure signals a violated precondition by throwing `ex-info`, which a surrounding `try`/`catch` turns into a printed message.

## Run

    clojure -M main.clj
