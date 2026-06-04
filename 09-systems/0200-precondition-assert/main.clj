;; Validate a precondition arg>0; on failure throw and handle it.
(defn check [arg]
  (when-not (pos? arg)
    (throw (ex-info "must be positive" {})))
  "ok")

(doseq [arg [5 -1]]
  (try
    (println (check arg))
    (catch Exception e
      (println (str "error: " (.getMessage e))))))
