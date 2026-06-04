(def cache (atom {}))

(defn flyweight [key]
  (if-let [existing (@cache key)]
    existing
    (let [obj {:char key}]
      (swap! cache assoc key obj)
      obj)))

(doseq [c ["a" "b" "a"]]
  (flyweight c))

(println (count @cache))
