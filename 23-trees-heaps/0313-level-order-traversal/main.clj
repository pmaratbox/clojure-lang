(defn insert [node k]
  (cond
    (nil? node) {:val k :left nil :right nil}
    (< k (:val node)) (update node :left insert k)
    (> k (:val node)) (update node :right insert k)
    :else node))

(defn level-order [root]
  (loop [queue [root] acc []]
    (if (empty? queue)
      acc
      (let [node (first queue)
            rest-q (subvec queue 1)
            children (filterv some? [(:left node) (:right node)])]
        (recur (into rest-q children) (conj acc (:val node)))))))

(def tree (reduce insert nil [5 3 8 1 4]))

(println (apply str (interpose " " (level-order tree))))
