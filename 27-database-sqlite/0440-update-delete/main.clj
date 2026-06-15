(require '[next.jdbc :as jdbc])

(with-open [con (jdbc/get-connection (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))]
  (jdbc/execute! con ["create table users(id integer, name text)"])
  (doseq [[id nm] [[1 "alice"] [2 "bob"] [3 "carol"]]]
    (jdbc/execute! con ["insert into users values(?,?)" id nm]))
  (jdbc/execute! con ["update users set name='robert' where id=2"])
  (jdbc/execute! con ["delete from users where id=1"])
  (doseq [row (jdbc/execute! con ["select id,name from users order by id"])]
    (println (val (first row)) (val (second row)))))
