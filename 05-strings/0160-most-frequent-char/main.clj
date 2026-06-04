(def text "hello")
(def best (key (apply max-key val (frequencies text))))
(println best)
