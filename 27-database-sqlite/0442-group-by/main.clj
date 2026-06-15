(require '[next.jdbc :as jdbc])

(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))

(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table sales(category text, amount integer)"])
  (doseq [[cat amt] [["a" 10] ["b" 20] ["a" 30] ["b" 5] ["a" 2]]]
    (jdbc/execute! con ["insert into sales values(?,?)" cat amt]))
  (doseq [row (jdbc/execute! con ["select category,sum(amount) from sales group by category order by category"])]
    (println (val (first row)) (val (second row)))))
