(defn check [n]
  (when (> n 100)
    (throw (ex-info "value too large" {:type :too-large}))))

(try
  (check 200)
  (catch clojure.lang.ExceptionInfo e
    (println (str "error: " (.getMessage e)))))
