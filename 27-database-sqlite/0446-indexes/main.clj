(require '[next.jdbc :as jdbc])
(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))
(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table products(id integer, sku text, price integer)"])
  (doseq [[id sku price] [[1 "A" 100] [2 "B" 200] [3 "C" 300]]]
    (jdbc/execute! con ["insert into products values(?,?,?)" id sku price]))
  (jdbc/execute! con ["create index idx_sku on products(sku)"])
  (doseq [row (jdbc/execute! con ["select price from products where sku=?" "B"])]
    (println (val (first row)))))
