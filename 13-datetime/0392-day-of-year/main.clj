(def month-days [31 29 31 30 31 30 31 31 30 31 30 31])
(def day-of-year (+ (reduce + (take 2 month-days)) 1))
(println day-of-year)
