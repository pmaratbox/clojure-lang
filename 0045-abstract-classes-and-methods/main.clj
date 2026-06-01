(defprotocol Shape
  (area [this]))

(defn describe [shape]
  (str "area: " (area shape)))

(defrecord Square [side]
  Shape
  (area [this] (* side side)))

(println (describe (->Square 3)))
