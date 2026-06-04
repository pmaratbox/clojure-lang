(defn iso-date [y m d]
  (format "%04d-%02d-%02d" y m d))

(println (iso-date 2026 6 4))
