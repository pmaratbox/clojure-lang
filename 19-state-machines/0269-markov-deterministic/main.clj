(def next-state {"A" "B" "B" "C" "C" "A"})

(def visited (take 3 (rest (iterate next-state "A"))))

(println (apply str (interpose " " visited)))
