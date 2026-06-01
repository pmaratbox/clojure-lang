(def nums (set [1 2 2 3]))

(println "size:" (count nums))
(println "has 2:" (if (contains? nums 2) "yes" "no"))
(println "has 5:" (if (contains? nums 5) "yes" "no"))
