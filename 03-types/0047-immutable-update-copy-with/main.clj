(def p1 {:x 1 :y 2})
(def p2 (assoc p1 :x 9))

(println (str "original: (" (:x p1) ", " (:y p1) ")"))
(println (str "updated: (" (:x p2) ", " (:y p2) ")"))
