(def names ["Sunday" "Monday" "Tuesday" "Wednesday" "Thursday" "Friday" "Saturday"])
(def result (names (mod (+ 6 3) 7)))
(println result)
