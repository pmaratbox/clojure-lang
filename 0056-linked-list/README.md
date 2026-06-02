# 0056 — Linked List

Build a singly-linked list holding `1`, `2`, and `3`, then traverse it from head to tail and print `1 -> 2 -> 3`. A Clojure list *is* a singly-linked list of cons cells, so `(list 1 2 3)` is the structure itself; `first` reads the head value and `next` returns the rest — the linked-list primitives.

## Run

    clojure -M main.clj
