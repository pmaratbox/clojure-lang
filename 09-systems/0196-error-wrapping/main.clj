(let [inner (ex-info "inner" {})
      outer (ex-info "outer" {} inner)]
  (println (str (.getMessage outer) ": " (.getMessage (.getCause outer)))))
