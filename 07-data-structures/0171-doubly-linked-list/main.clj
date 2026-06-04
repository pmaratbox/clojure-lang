;; Doubly linked list as a vector of nodes; each node knows prev/next indices.
(def nodes
  [{:val 1 :prev nil :next 1}
   {:val 2 :prev 0   :next 2}
   {:val 3 :prev 1   :next nil}])

(defn walk [start step]
  (loop [i start acc []]
    (if (nil? i)
      acc
      (recur (step (nodes i)) (conj acc (:val (nodes i)))))))

(def forward (walk 0 :next))
(def backward (walk 2 :prev))

(println (apply str (interpose " " forward)))
(println (apply str (interpose " " backward)))
