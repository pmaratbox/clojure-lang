(def levels {:INFO 0 :WARN 1 :ERROR 2})

(def threshold (:WARN levels))

(defn log [level msg]
  (when (>= (levels level) threshold)
    (println (str (name level) ": " msg))))

(log :INFO "i")
(log :WARN "w")
(log :ERROR "e")
