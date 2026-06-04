(defn insert [node k]
  (cond
    (nil? node) {:val k :left nil :right nil}
    (< k (:val node)) (update node :left insert k)
    (> k (:val node)) (update node :right insert k)
    :else node))

(defn min-val [node]
  (if (:left node) (recur (:left node)) (:val node)))

(defn delete [node k]
  (cond
    (nil? node) nil
    (< k (:val node)) (update node :left delete k)
    (> k (:val node)) (update node :right delete k)
    :else (cond
            (nil? (:left node)) (:right node)
            (nil? (:right node)) (:left node)
            :else (let [s (min-val (:right node))]
                    (-> node
                        (assoc :val s)
                        (update :right delete s))))))

(defn in-order [node]
  (when node
    (concat (in-order (:left node)) [(:val node)] (in-order (:right node)))))

(def tree (delete (reduce insert nil [5 3 8 1 4]) 3))

(println (apply str (interpose " " (in-order tree))))
