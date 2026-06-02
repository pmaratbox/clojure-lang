(defn point [x y] {:x x :y y})

(defn add [a b]
  (point (+ (:x a) (:x b)) (+ (:y a) (:y b))))

(let [p (add (point 1 2) (point 3 4))]
  (println (str "(" (:x p) ", " (:y p) ")")))
