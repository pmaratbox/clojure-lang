# 0042 — Environment Variables

Read the environment variable `LESSON_ENV_VAR`, falling back to `default` when it is unset, and print `value: default`. `(System/getenv name)` returns the value or `nil`, and `(or value "default")` falls back when it is `nil`. Java interop is the usual route to the environment.

## Run

    clojure -M main.clj
