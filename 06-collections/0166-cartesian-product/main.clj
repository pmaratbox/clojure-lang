(println (apply str
                (interpose " "
                           (for [n [1 2]
                                 c ["a" "b"]]
                             (str n c)))))
