(def nums [1 5 11 5])
(def total (reduce + nums))

(defn subset-sum? [target]
  (contains?
   (reduce
    (fn [acc x]
      (into acc (for [s acc :when (<= (+ s x) target)] (+ s x))))
    #{0}
    nums)
   target))

(println (if (and (even? total) (subset-sum? (quot total 2))) "yes" "no"))
