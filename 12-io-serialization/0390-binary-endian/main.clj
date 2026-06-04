(def n 258)
(def hi (quot n 256))
(def lo (mod n 256))
(def decoded (+ (* hi 256) lo))

(println (str hi " " lo " " decoded))
