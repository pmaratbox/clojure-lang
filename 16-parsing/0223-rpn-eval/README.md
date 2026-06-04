# 0223 — RPN Evaluator

Evaluate the postfix expression "3 4 + 5 *" and print `35`. Clojure folds the tokens with `reduce` over a persistent-list stack.

## Run

    clojure -M main.clj
