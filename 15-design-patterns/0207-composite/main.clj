(defn leaf [v] {:type :leaf :value v})
(defn composite [children] {:type :composite :children children})

(defn size [node]
  (if (= (:type node) :leaf)
    (:value node)
    (reduce + (map size (:children node)))))

(println (size (composite [(leaf 1) (leaf 2) (leaf 3)])))
