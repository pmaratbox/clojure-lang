(defn min-max [coll]
  (reduce (fn [[lo hi] x]
            [(min lo x) (max hi x)])
          [(first coll) (first coll)]
          (rest coll)))

(let [[lo hi] (min-max [4 1 7])]
  (println lo hi))
