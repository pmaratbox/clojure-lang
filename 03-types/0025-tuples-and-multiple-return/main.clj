(defn min-max [a b]
  (if (< a b) [a b] [b a]))

(let [[lo hi] (min-max 3 7)]
  (println "min:" lo)
  (println "max:" hi))
