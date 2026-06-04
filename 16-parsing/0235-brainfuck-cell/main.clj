(defn run [program]
  (reduce (fn [cell c]
            (case c
              \+ (inc cell)
              \- (dec cell)
              cell))
          0
          program))

(println (run "+++"))
