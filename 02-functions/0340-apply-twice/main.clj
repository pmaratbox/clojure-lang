(defn apply-twice [f x]
  (f (f x)))

(println (apply-twice inc 3))
