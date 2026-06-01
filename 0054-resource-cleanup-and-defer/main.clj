(defn open []
  (println "open")
  (reify java.io.Closeable
    (close [_] (println "close"))))

(with-open [_ (open)]
  (println "use"))
