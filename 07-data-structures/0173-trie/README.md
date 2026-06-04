# 0173 — Trie

Insert "cat" and "car" into a trie, then search "car" (yes) and "can" (no), printing `yes no`. Nested maps make a trie almost free: `assoc-in` inserts a character path and `get-in` reads it, with `:end` flagging a complete word.

## Run

    clojure -M main.clj
