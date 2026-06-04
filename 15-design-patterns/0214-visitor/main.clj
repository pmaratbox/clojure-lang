(def tree {:value 1 :children [{:value 2 :children []}
                               {:value 3 :children []}]})

(defn sum-visitor [node]
  (+ (:value node) (reduce + (map sum-visitor (:children node)))))

(println (sum-visitor tree))
