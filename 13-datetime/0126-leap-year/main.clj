(defn leap? [year]
  (and (zero? (mod year 4))
       (or (not (zero? (mod year 100)))
           (zero? (mod year 400)))))

(println (apply str (interpose " " (map #(if (leap? %) "yes" "no") [2000 1900 2024]))))
