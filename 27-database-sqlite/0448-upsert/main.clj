(require '[next.jdbc :as jdbc])

(with-open [con (jdbc/get-connection (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))]
  (jdbc/execute! con ["create table inv(item text primary key, qty integer)"])
  (jdbc/execute! con ["insert into inv values('apple',5)"])
  (doseq [[item qty] [["apple" 5] ["banana" 3]]]
    (jdbc/execute! con ["insert into inv(item,qty) values(?,?) on conflict(item) do update set qty=qty+excluded.qty" item qty]))
  (doseq [row (jdbc/execute! con ["select item,qty from inv order by item"])]
    (println (val (first row)) (val (second row)))))
