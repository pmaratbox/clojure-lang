(def adj {0 [1] 1 [2] 2 [0 3] 3 []})
(def n 4)

(def radj
  (reduce (fn [m [u vs]] (reduce #(update %1 %2 conj u) m vs))
          (zipmap (range n) (repeat []))
          adj))

(defn dfs [g start visited]
  (loop [stack [start] vis visited order ()]
    (if (empty? stack)
      [vis order]
      (let [u (peek stack)]
        (if (vis u)
          (recur (pop stack) vis order)
          (recur (into (pop stack) (g u)) (conj vis u) (cons u order)))))))

;; Kosaraju: order by finish time on g, then DFS on reverse graph
(defn finish-order []
  (let [visited (atom #{})
        order (atom ())]
    (letfn [(visit [u]
              (when-not (@visited u)
                (swap! visited conj u)
                (doseq [v (adj u)] (visit v))
                (swap! order conj u)))]
      (doseq [u (range n)] (visit u))
      @order)))

(defn scc-count []
  (loop [order (finish-order) seen #{} cnt 0]
    (if (empty? order)
      cnt
      (let [u (first order)]
        (if (seen u)
          (recur (rest order) seen cnt)
          (let [[vis _] (dfs radj u seen)]
            (recur (rest order) vis (inc cnt))))))))

(println (scc-count))
