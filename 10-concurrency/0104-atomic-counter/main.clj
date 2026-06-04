(let [counter (atom 0)
      workers (doall (repeatedly 10
                       #(future
                          (dotimes [_ 100]
                            (swap! counter inc)))))]
  (doseq [w workers] (deref w))
  (println @counter))
