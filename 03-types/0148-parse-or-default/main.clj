(defn parse-or-default [s default]
  (try
    (Integer/parseInt s)
    (catch NumberFormatException _ default)))

(println (parse-or-default "42" 0) (parse-or-default "x" 0))
