(defmulti speak identity)
(defmethod speak :default [_] "some sound")
(defmethod speak :dog [_] "Woof")

(println "animal:" (speak :animal))
(println "dog:" (speak :dog))
