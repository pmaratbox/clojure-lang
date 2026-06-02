(def counter (atom 1))

(println "before:" @counter)
(swap! counter inc)
(println "after:" @counter)
