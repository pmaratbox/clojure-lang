;; Recursive depth-first search visiting neighbors in list order.
(def graph {0 [1 2]
            1 [0 3]
            2 [0 3]
            3 [1 2]})

(defn dfs [g start]
  (loop [stack [start]
         visited #{}
         order []]
    (if (empty? stack)
      order
      (let [node (peek stack)
            stack (pop stack)]
        (if (visited node)
          (recur stack visited order)
          (recur (into stack (reverse (g node)))
                 (conj visited node)
                 (conj order node)))))))

(println (apply str (interpose " " (dfs graph 0))))
