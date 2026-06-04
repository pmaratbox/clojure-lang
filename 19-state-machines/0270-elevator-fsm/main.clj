(defn ride [start targets]
  (reduce (fn [floors target]
            (let [cur (peek floors)
                  step (Integer/signum (- target cur))]
              (if (zero? step)
                floors
                (into floors (range (+ cur step) (+ target step) step)))))
          [start]
          targets))

(println (apply str (interpose " " (ride 0 [2 0]))))
