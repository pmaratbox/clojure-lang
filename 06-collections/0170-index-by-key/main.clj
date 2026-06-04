(def people [{:id 1 :name "alice"}
             {:id 2 :name "bob"}])

(def by-id (into {} (map (juxt :id :name) people)))

(println (str "id 2: " (by-id 2)))
