(def coins [1 2 5])
(def target 5)

(def dp
  (reduce
   (fn [dp c]
     (reduce
      (fn [dp amt]
        (update dp amt + (dp (- amt c))))
      dp
      (range c (inc target))))
   (assoc (vec (repeat (inc target) 0)) 0 1)
   coins))

(println (dp target))
