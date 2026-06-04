(defn label [flag]
  (if flag "enabled" "disabled"))

(println (str (label true) " " (label false)))
