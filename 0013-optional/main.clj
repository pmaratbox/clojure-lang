(def present 42)
(def absent nil)

(println "present:" (or present -1))
(println "absent:" (or absent -1))
