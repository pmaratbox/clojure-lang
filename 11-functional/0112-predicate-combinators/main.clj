(defn p-and [p q]
  (fn [x] (and (p x) (q x))))

(def is-even even?)
(def is-positive pos?)
(def check (p-and is-even is-positive))

(println (if (check 4) "yes" "no") (if (check -4) "yes" "no"))
