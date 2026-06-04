(def nested [1 [2 [3 4]] 5])

(defn deep-flatten [x]
  (if (sequential? x)
    (mapcat deep-flatten x)
    [x]))

(println (apply str (interpose " " (deep-flatten nested))))
