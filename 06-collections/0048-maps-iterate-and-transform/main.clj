(def scores {:a 1 :b 2 :c 3})
(def total (reduce + (vals scores)))

(println (str "sum: " total))
