(defn total [& nums]
  (apply + nums))

(println "sum:" (total 1 2 3))
