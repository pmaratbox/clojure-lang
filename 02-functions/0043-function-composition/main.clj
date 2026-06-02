(defn twice [x] (* x 2))

(println ((comp inc twice) 3))
