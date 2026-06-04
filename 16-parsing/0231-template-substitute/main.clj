(defn substitute [tmpl vars]
  (reduce (fn [s [k v]]
            (.replace s (str "{" k "}") v))
          tmpl
          vars))

(println (substitute "hi {name}" {"name" "Ada"}))
