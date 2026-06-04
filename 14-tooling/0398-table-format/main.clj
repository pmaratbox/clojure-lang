(def rows [["a" "1"] ["bb" "22"]])

(def w (apply max (map (comp count first) rows)))

(doseq [[c1 c2] rows]
  (println (str (format (str "%-" w "s") c1) " | " c2)))
