(def adj {0 [1] 1 [2] 2 [0]})
(def n 3)

(defn has-cycle? []
  (let [state (atom (zipmap (range n) (repeat :white)))]
    (letfn [(dfs [u]
              (swap! state assoc u :gray)
              (let [found (some (fn [v]
                                  (case (@state v)
                                    :gray true
                                    :white (dfs v)
                                    false))
                                (get adj u []))]
                (swap! state assoc u :black)
                (boolean found)))]
      (boolean (some #(when (= :white (@state %)) (dfs %)) (range n))))))

(println (if (has-cycle?) "cycle" "acyclic"))
