(defn coffee [] 2)
(defn milk [c] (fn [] (+ (c) 1)))
(defn sugar [c] (fn [] (+ (c) 1)))

(let [drink (sugar (milk coffee))]
  (println (drink)))
