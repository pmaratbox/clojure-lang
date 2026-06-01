(defn largest [a b]
  (if (pos? (compare a b)) a b))

(println (largest 3 9))
(println (largest "apple" "pear"))
