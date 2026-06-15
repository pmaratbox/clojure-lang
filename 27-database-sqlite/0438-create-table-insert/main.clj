(require '[next.jdbc :as jdbc])

(with-open [con (jdbc/get-connection (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))]
  (jdbc/execute! con ["create table users(id integer, name text)"])
  (doseq [[id nm] [[1 "alice"] [2 "bob"] [3 "carol"]]]
    (jdbc/execute! con ["insert into users values(?,?)" id nm]))
  (doseq [row (jdbc/execute! con ["select name from users order by id"])]
    (println (val (first row)))))
