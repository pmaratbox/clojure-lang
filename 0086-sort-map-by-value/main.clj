(def scores {"a" 3 "b" 1 "c" 2})
(println (clojure.string/join " " (map (fn [[k v]] (str k ":" v)) (sort-by val scores))))
