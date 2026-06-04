(def people [{:name "alice" :age 30}
             {:name "bob" :age 25}])

(let [sorted (sort-by :age people)]
  (println (apply str (interpose " " (map :name sorted)))))
