(defn insert [node k]
  (cond
    (nil? node) {:val k :left nil :right nil}
    (< k (:val node)) (update node :left insert k)
    (> k (:val node)) (update node :right insert k)
    :else node))

(defn search [node k]
  (cond
    (nil? node) false
    (= k (:val node)) true
    (< k (:val node)) (recur (:left node) k)
    :else (recur (:right node) k)))

(def tree (reduce insert nil [5 3 8 1 4]))

(println (if (search tree 4) "yes" "no")
         (if (search tree 6) "yes" "no"))
