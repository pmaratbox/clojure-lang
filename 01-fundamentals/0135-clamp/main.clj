(defn clamp [x lo hi]
  (max lo (min x hi)))

(println (clamp 15 0 10) (clamp -3 0 10))
