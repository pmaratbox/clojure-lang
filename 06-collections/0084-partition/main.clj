(def nums [1 2 3 4 5 6])
(def groups (group-by even? nums))
(println (str "evens: " (clojure.string/join " " (groups true))))
(println (str "odds: " (clojure.string/join " " (groups false))))
