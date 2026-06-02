(defn first-of [coll]
  (first coll))

(def nums [1 2 3])
(def words ["a" "b" "c"])

(println (str "first int: " (first-of nums)))
(println (str "first string: " (first-of words)))
