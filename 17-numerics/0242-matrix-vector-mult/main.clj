(defn matvec [m v]
  (mapv (fn [row] (apply + (map * row v))) m))

(let [r (matvec [[1 2] [3 4]] [5 6])]
  (println (apply str (interpose " " r))))
