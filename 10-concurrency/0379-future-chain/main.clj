(def step1 (future 5))
(def step2 (future (* 2 @step1)))
(def step3 (future (+ 1 @step2)))

(println @step3)
