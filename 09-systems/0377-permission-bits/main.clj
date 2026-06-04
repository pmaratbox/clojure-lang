(def bits 2r101)

(println (str (if (bit-test bits 2) "r" "-")
              (if (bit-test bits 1) "w" "-")
              (if (bit-test bits 0) "x" "-")))
