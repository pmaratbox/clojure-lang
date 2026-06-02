(def m {"a" 1 "b" 2 "c" 3})
(def inverted (into {} (map (fn [[k v]] [v k]) m)))
(println (clojure.string/join " " (map (fn [k] (str k ":" (inverted k))) (sort (keys inverted)))))
