(def coins [1 2 5])
(def target 11)

(def dp
  (reduce
   (fn [dp amt]
     (assoc dp amt
            (reduce min Long/MAX_VALUE
                    (for [c coins :when (<= c amt)
                          :let [prev (dp (- amt c))]
                          :when (not= prev Long/MAX_VALUE)]
                      (inc prev)))))
   {0 0}
   (range 1 (inc target))))

(println (dp target))
