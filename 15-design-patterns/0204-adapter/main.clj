(def celsius-source {:celsius 100})

(defn fahrenheit-adapter [src]
  {:fahrenheit (+ (* (:celsius src) 9/5) 32)})

(println (int (:fahrenheit (fahrenheit-adapter celsius-source))))
