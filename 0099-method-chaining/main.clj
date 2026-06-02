(defn add [c n] (+ c n))
(defn multiply [c n] (* c n))

(println (-> 5
             (add 3)
             (multiply 2)))
