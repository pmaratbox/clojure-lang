(def n 3)
(def arrived (atom 0))

(def threads
  (doall
    (for [_ (range n)]
      (future
        (swap! arrived inc)
        (while (< @arrived n)
          (Thread/sleep 1))))))

(doseq [t threads] @t)
(println (str "all reached: " @arrived))
