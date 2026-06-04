(defn next-row [row]
  (map + (cons 0 row) (concat row [0])))

(doseq [row (take 4 (iterate next-row [1]))]
  (println (clojure.string/join " " row)))
