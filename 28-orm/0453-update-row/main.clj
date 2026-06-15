(require '[next.jdbc :as jdbc] '[honey.sql :as sql])

(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))

(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table users(id integer primary key, name text, age integer)"])
  (doseq [[id nm age] [[1 "alice" 30] [2 "bob" 25] [3 "carol" 35]]]
    (jdbc/execute! con (sql/format {:insert-into :users
                                    :columns [:id :name :age]
                                    :values [[id nm age]]})))
  (jdbc/execute! con (sql/format {:update :users
                                  :set {:age 40}
                                  :where [:= :name "bob"]}))
  (doseq [row (jdbc/execute! con (sql/format {:select [:name :age]
                                              :from :users
                                              :where [:>= :age 35]
                                              :order-by [:id]}))]
    (println (str (:users/name row) " " (:users/age row)))))
