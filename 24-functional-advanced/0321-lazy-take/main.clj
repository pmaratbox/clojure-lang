(def naturals (iterate inc 1))

(apply println (take 5 naturals))
