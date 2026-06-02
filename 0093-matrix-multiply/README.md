# 0093 — Matrix Multiply

Multiply the 2x2 matrices `[[1, 2], [3, 4]]` and `[[5, 6], [7, 8]]` and print the product, one row per line: `19 22` and `43 50`. Nested `for` comprehensions build each row; an entry is `(reduce +)` over the products `a[i][k] * b[k][j]` (`get-in` indexes the nested vectors).

## Run

    clojure -M main.clj
