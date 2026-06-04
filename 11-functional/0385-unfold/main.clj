(defn join [sep coll]
  (apply str (interpose sep coll)))

(def terms (take 5 (iterate #(* 2 %) 1)))

(println (join " " terms))
