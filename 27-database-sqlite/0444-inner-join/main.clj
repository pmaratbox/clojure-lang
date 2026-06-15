(require '[next.jdbc :as jdbc])
(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))
(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table users(id integer, name text)"])
  (jdbc/execute! con ["create table orders(user_id integer, item text)"])
  (doseq [[id nm] [[1 "alice"] [2 "bob"]]]
    (jdbc/execute! con ["insert into users values(?,?)" id nm]))
  (doseq [[uid item] [[1 "book"] [2 "pen"] [1 "lamp"]]]
    (jdbc/execute! con ["insert into orders values(?,?)" uid item]))
  (doseq [row (jdbc/execute! con ["select u.name, o.item from orders o join users u on u.id=o.user_id order by u.name, o.item"])]
    (println (val (first row)) (val (second row)))))
