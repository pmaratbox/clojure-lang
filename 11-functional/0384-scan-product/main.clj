(def xs [1 2 3 4])

(defn join [sep coll]
  (apply str (interpose sep coll)))

(def scans (reductions * xs))

(println (join " " scans))
