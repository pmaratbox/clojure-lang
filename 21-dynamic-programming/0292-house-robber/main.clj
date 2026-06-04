(def houses [2 7 9 3 1])

(def result
  (reduce
   (fn [[prev curr] x]
     [curr (max curr (+ prev x))])
   [0 0]
   houses))

(println (second result))
