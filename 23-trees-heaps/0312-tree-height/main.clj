(defn insert [node k]
  (cond
    (nil? node) {:val k :left nil :right nil}
    (< k (:val node)) (update node :left insert k)
    (> k (:val node)) (update node :right insert k)
    :else node))

(defn height [node]
  (if (nil? node)
    0
    (inc (max (height (:left node)) (height (:right node))))))

(def tree (reduce insert nil [5 3 8 1 4]))

(println (height tree))
