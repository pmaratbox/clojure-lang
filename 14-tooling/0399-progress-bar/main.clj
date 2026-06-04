(def width 10)

(def filled (Math/round (* width 0.4)))

(println (str "[" (apply str (repeat filled "#")) (apply str (repeat (- width filled) "-")) "]"))
