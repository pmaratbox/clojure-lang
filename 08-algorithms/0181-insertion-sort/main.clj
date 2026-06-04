(defn insert [sorted x]
  (let [[less ge] (split-with #(<= % x) sorted)]
    (concat less [x] ge)))

(defn insertion-sort [coll]
  (reduce insert [] coll))

(println (clojure.string/join " " (insertion-sort [5 1 4 2 8])))
