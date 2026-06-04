# 0171 — Doubly Linked List

Build a doubly linked list 1<->2<->3, traverse forward then backward, printing `1 2 3` then `3 2 1` on two lines. In Clojure we model nodes as immutable maps holding `:prev`/`:next` indices and walk them with `loop`/`recur`.

## Run

    clojure -M main.clj
