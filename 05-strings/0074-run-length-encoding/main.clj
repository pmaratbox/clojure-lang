(def text "aaabbc")
(def result
  (apply str (mapcat (fn [run] [(first run) (count run)])
                     (partition-by identity text))))
(println result)
