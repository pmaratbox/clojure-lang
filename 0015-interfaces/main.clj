(defprotocol Shape
  (shape-name [s])
  (area [s]))

(defrecord Rectangle [width height]
  Shape
  (shape-name [_] "rectangle")
  (area [_] (* width height)))

(defrecord Square [side]
  Shape
  (shape-name [_] "square")
  (area [_] (* side side)))

(def shapes [(->Rectangle 3 4) (->Square 5)])
(doseq [s shapes]
  (println (str (shape-name s) " area: " (area s))))
