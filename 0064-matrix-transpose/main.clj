(def matrix [[1 2 3] [4 5 6]])
(def transposed (apply mapv vector matrix))

(doseq [row transposed]
  (println (clojure.string/join " " row)))
