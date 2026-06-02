(def sb (StringBuilder.))
(doseq [[i n] (map-indexed vector [1 2 3])]
  (when (pos? i) (.append sb "-"))
  (.append sb n))
(println (.toString sb))
