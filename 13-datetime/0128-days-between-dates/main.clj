(defn days-from-civil [y m d]
  (let [y (if (<= m 2) (dec y) y)
        era (quot (if (>= y 0) y (- y 399)) 400)
        yoe (- y (* era 400))
        doy (+ (quot (+ (* 153 (+ (if (> m 2) (- m 3) (+ m 9))) ) 2) 5) (dec d))
        doe (+ (* yoe 365) (quot yoe 4) (- (quot yoe 100)) doy)]
    (+ (* era 146097) doe -719468)))

(println (- (days-from-civil 2000 12 31) (days-from-civil 2000 1 1)))
