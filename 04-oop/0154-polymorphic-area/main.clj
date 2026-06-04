(defprotocol Shape
  (area [s]))

(defrecord Rectangle [w h]
  Shape
  (area [_] (* w h)))

(defrecord Triangle [base height]
  Shape
  (area [_] (/ (* base height) 2)))

(let [shapes [(->Rectangle 2 3) (->Triangle 4 4)]
      total (reduce + (map area shapes))]
  (println (str "total area: " total)))
