(defn insert [node value]
  (if (nil? node)
    {:value value :left nil :right nil}
    (if (< value (:value node))
      (assoc node :left (insert (:left node) value))
      (assoc node :right (insert (:right node) value)))))

(defn inorder [node]
  (if (nil? node)
    []
    (concat (inorder (:left node)) [(:value node)] (inorder (:right node)))))

(def tree (reduce insert nil [5 3 8 1 4]))
(println (clojure.string/join " " (inorder tree)))
