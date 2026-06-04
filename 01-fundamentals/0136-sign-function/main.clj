(defn sign [x]
  (cond
    (neg? x) -1
    (pos? x) 1
    :else 0))

(println (sign -5) (sign 0) (sign 5))
