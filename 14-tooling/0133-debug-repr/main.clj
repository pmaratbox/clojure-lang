(defrecord Point [x y])

(defn point-repr [p]
  (str "Point(x=" (:x p) ", y=" (:y p) ")"))

(println (point-repr (->Point 1 2)))
