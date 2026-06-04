(defn leap? [y]
  (and (zero? (mod y 4))
       (or (not (zero? (mod y 100)))
           (zero? (mod y 400)))))
(defn feb-days [y] (if (leap? y) 29 28))
(println (str (feb-days 2000) " " (feb-days 2001)))
