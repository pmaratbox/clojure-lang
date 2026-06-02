(def nums [1 2 3 4])
(def sums (reductions + nums))

(println (clojure.string/join " " sums))
