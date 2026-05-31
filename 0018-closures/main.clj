(defn make-counter []
  (let [n (atom 0)]
    (fn [] (swap! n inc))))

(def next-count (make-counter))
(println (str "count: " (next-count)))
(println (str "count: " (next-count)))
