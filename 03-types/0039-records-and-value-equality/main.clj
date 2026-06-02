(defrecord Point [x y])

(def p1 (->Point 1 2))
(def p2 (->Point 1 2))

(println (str "point: (" (:x p1) ", " (:y p1) ")"))
(println "equal:" (if (= p1 p2) "yes" "no"))
