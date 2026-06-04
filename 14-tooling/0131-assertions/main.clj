(defn check [actual expected]
  (when (not= actual expected)
    (throw (ex-info "assertion failed" {:actual actual :expected expected}))))

(check (+ 1 1) 2)
(check (* 3 4) 12)
(check (str "a" "b") "ab")

(println "all passed")
