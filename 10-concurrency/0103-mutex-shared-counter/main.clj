(let [counter (atom 0)
      lock (Object.)
      workers (doall (repeatedly 10
                       #(future
                          (dotimes [_ 100]
                            (locking lock
                              (swap! counter inc))))))]
  (doseq [w workers] (deref w))
  (println @counter))
