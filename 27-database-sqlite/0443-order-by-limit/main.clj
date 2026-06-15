(require '[next.jdbc :as jdbc])

(with-open [con (jdbc/get-connection (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))]
  (jdbc/execute! con ["create table scores(value integer)"])
  (doseq [v [50 90 70 30 100 20]]
    (jdbc/execute! con ["insert into scores values(?)" v]))
  (doseq [row (jdbc/execute! con ["select value from scores order by value desc limit 3"])]
    (println (val (first row)))))
