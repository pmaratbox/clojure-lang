(defn divide [a b]
  (if (zero? b)
    (throw (ex-info "division by zero" {}))
    (quot a b)))

(println "10 / 2 =" (divide 10 2))

(try
  (divide 10 0)
  (catch clojure.lang.ExceptionInfo e
    (println "error:" (.getMessage e))))
