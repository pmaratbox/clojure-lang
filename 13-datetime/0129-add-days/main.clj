(defn days-from-civil [y m d]
  (let [y (if (<= m 2) (dec y) y)
        era (quot (if (>= y 0) y (- y 399)) 400)
        yoe (- y (* era 400))
        doy (+ (quot (+ (* 153 (if (> m 2) (- m 3) (+ m 9))) 2) 5) (dec d))
        doe (+ (* yoe 365) (quot yoe 4) (- (quot yoe 100)) doy)]
    (+ (* era 146097) doe -719468)))

(defn civil-from-days [z]
  (let [z (+ z 719468)
        era (quot (if (>= z 0) z (- z 146096)) 146097)
        doe (- z (* era 146097))
        yoe (quot (+ doe (- (quot doe 1460)) (quot doe 36524) (- (quot doe 146096))) 365)
        y (+ yoe (* era 400))
        doy (- doe (+ (* 365 yoe) (quot yoe 4) (- (quot yoe 100))))
        mp (quot (+ (* 5 doy) 2) 153)
        d (+ (- doy (quot (+ (* 153 mp) 2) 5)) 1)
        m (if (< mp 10) (+ mp 3) (- mp 9))
        y (if (<= m 2) (inc y) y)]
    [y m d]))

(defn fmt [[y m d]]
  (format "%04d-%02d-%02d" y m d))

(println (fmt (civil-from-days (+ (days-from-civil 2000 1 1) 40))))
