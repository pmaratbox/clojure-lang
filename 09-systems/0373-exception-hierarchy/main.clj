(try
  (throw (ex-info "boom" {:type :specific}))
  (catch RuntimeException _
    (println "caught base")))
