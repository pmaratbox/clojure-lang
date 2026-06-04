# 0346 — Newtype Wrapper

Wrap raw integers in distinct UserId and ProductId types so they cannot be confused, printing `user-1 prod-2`. Two single-field `defrecord` types give distinct concrete classes that a bare int never satisfies.

## Run

    clojure -M main.clj
