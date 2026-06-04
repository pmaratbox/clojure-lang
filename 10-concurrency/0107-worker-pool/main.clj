(let [tasks (range 1 5)
      workers (doall (map (fn [n] (future (* n n))) tasks))
      results (sort (map deref workers))]
  (println (apply str (interpose " " results))))
