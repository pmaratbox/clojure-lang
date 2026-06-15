(require '[next.jdbc :as jdbc] '[honey.sql :as sql])

(with-open [con (jdbc/get-connection (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))]
  (jdbc/execute! con ["create table users(id integer primary key, name text, age integer)"])
  (doseq [[id nm age] [[1 "alice" 30] [2 "bob" 25] [3 "carol" 35]]]
    (jdbc/execute! con (sql/format {:insert-into :users
                                    :columns [:id :name :age]
                                    :values [[id nm age]]})))
  (jdbc/execute! con (sql/format {:delete-from :users
                                  :where [:= :id 1]}))
  (doseq [row (jdbc/execute! con (sql/format {:select :name
                                              :from :users
                                              :order-by [:id]}))]
    (println (val (first row)))))
