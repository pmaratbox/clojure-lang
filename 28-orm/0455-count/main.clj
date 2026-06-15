(require '[next.jdbc :as jdbc] '[honey.sql :as sql])

(with-open [con (jdbc/get-connection
                  (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))]
  (jdbc/execute! con ["create table users(id integer primary key, name text, age integer)"])
  (doseq [[id nm age] [[1 "alice" 30] [2 "bob" 25] [3 "carol" 35]]]
    (jdbc/execute! con (sql/format {:insert-into :users
                                    :columns [:id :name :age]
                                    :values [[id nm age]]})))
  (let [row (first (jdbc/execute! con (sql/format {:select [[[:count :*]]]
                                                   :from :users})))]
    (println (val (first row)))))
