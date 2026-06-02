# 0064 — Matrix Transpose

Transpose the 2x3 matrix `[[1, 2, 3], [4, 5, 6]]` (swap rows and columns) and print the resulting 3x2 matrix, one row per line: `1 4`, `2 5`, `3 6`. `(apply mapv vector matrix)` maps `vector` across the rows in lockstep, zipping element `j` of each row into the `j`-th column.

## Run

    clojure -M main.clj
