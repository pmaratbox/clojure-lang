(def words ["one" "two" "three"])
(def groups (group-by count words))

(println (clojure.string/join " "
                              (map (fn [k] (str k ":[" (clojure.string/join "," (groups k)) "]"))
                                   (sort (keys groups)))))
