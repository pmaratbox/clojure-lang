(try
  (throw (ex-info "boom" {}))
  (catch Exception _
    (println "caught"))
  (finally
    (println "cleanup")))
