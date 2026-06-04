(defrecord Point [x y]
  Object
  (toString [_] (str "Point(" x ", " y ")")))

(println (str (->Point 1 2)))
