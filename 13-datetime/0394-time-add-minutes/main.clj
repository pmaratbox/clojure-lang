(def total (+ (+ (* 10 60) 45) 90))
(def hh (quot total 60))
(def mm (mod total 60))
(println (format "%02d:%02d" hh mm))
