(def READ 1)
(def WRITE 2)

(let [flags (bit-or READ WRITE)
      set?  (not (zero? (bit-and flags WRITE)))]
  (println flags (if set? "yes" "no")))
