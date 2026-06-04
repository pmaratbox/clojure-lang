(let [runs (atom 0)
      init (delay (swap! runs inc) :ready)
      workers (doall (repeatedly 10 #(future @init)))]
  (doseq [w workers] (deref w))
  (println (str "init count: " @runs)))
