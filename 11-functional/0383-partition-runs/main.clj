(def xs [1 1 2 3 3 3])

(defn join [sep coll]
  (apply str (interpose sep coll)))

(def runs (partition-by identity xs))

(println (join "|" (map #(join " " %) runs)))
