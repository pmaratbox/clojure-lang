# 0231 — Template Substitution

Substitute the variable in the template "hi {name}" with name="Ada", printing `hi Ada`. Clojure folds the variable map with `reduce`, replacing each `{key}` placeholder.

## Run

    clojure -M main.clj
