(def m {:a 1})
(def m2 (assoc m :b 2))

(defn keys-line [coll]
  (clojure.string/join " " (sort (map name (keys coll)))))

(println (keys-line m2))
(println (keys-line m))
