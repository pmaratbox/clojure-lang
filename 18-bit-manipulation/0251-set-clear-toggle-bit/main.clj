(def bit (bit-shift-left 1 1))

(def set-it (bit-or 0 bit))
(def clear-it (bit-and 2 (bit-not bit)))
(def toggle-it (bit-xor 0 bit))

(println set-it clear-it toggle-it)
