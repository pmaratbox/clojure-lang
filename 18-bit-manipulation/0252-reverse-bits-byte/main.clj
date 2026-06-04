(defn reverse-byte [x]
  (reduce (fn [acc i]
            (bit-or acc
                    (bit-shift-left (bit-and (bit-shift-right x i) 1)
                                    (- 7 i))))
          0
          (range 8)))

(println (reverse-byte 1))
