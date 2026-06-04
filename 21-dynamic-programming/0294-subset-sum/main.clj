(def nums [3 34 4 12 5 2])
(def target 9)

(def reachable
  (reduce
   (fn [acc x]
     (into acc (for [s acc :when (<= (+ s x) target)] (+ s x))))
   #{0}
   nums))

(println (if (contains? reachable target) "yes" "no"))
