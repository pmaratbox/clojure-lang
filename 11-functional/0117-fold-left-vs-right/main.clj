(defn foldr [f init coll]
  (reduce #(f %2 %1) init (reverse coll)))

(def l (reduce - 0 [1 2 3]))
(def r (foldr - 0 [1 2 3]))

(println l r)
