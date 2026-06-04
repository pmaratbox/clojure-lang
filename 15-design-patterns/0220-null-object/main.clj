(def count-atom (atom 0))

(def null-logger {:log (fn [] nil)})
(def real-logger {:log (fn [] (swap! count-atom inc))})

((:log null-logger))
((:log real-logger))

(println @count-atom)
