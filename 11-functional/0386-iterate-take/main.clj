(defn join [sep coll]
  (apply str (interpose sep coll)))

(def values (take 4 (iterate #(* 3 %) 1)))

(println (join " " values))
