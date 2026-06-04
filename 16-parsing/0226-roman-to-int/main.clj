(def values {\I 1 \V 5 \X 10 \L 50 \C 100 \D 500 \M 1000})

(defn roman->int [s]
  (let [vs (map values s)]
    (reduce + (map (fn [v nxt]
                     (if (and nxt (< v nxt)) (- v) v))
                   vs
                   (concat (rest vs) [nil])))))

(println (roman->int "XIV"))
