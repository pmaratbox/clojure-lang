(defn counting-sort [coll]
  (let [counts (frequencies coll)]
    (mapcat (fn [v] (repeat (counts v 0) v))
            (range (apply min coll) (inc (apply max coll))))))

(println (apply str (interpose " " (counting-sort [3 1 2 3 1]))))
