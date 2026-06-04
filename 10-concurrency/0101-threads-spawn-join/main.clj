(let [workers (doall (repeatedly 3 #(future (+ 1 1))))]
  (doseq [w workers] (deref w))
  (println (str "done: " (count workers))))
