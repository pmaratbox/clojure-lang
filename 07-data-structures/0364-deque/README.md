# 0364 — Double-Ended Queue

Using a deque, push 1 and 2 to the back and 0 to the front, then print front-to-back `0 1 2`. An `atom` over a vector supports `conj` for the back and `into [x]` for the front while reading naturally front-to-back.

## Run

    clojure -M main.clj
