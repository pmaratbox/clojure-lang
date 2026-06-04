(def obj {:name "Ada" :age 36})

(println (str "{\"name\":\"" (:name obj) "\",\"age\":" (:age obj) "}"))
