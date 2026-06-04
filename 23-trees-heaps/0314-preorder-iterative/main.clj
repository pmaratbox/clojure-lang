(defn insert [node k]
  (cond
    (nil? node) {:val k :left nil :right nil}
    (< k (:val node)) (update node :left insert k)
    (> k (:val node)) (update node :right insert k)
    :else node))

(defn preorder [root]
  (loop [stack [root] acc []]
    (if (empty? stack)
      acc
      (let [node (peek stack)
            stack (pop stack)
            stack (cond-> stack
                    (:right node) (conj (:right node))
                    (:left node) (conj (:left node)))]
        (recur stack (conj acc (:val node)))))))

(def tree (reduce insert nil [5 3 8 1 4]))

(println (apply str (interpose " " (preorder tree))))
