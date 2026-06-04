(def values [3 1 2])

(doseq [n values]
  (println (apply str (repeat n "#"))))
