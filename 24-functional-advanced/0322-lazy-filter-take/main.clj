(def naturals (iterate inc 1))

(apply println (take 3 (filter even? naturals)))
