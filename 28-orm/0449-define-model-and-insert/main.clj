(require '[next.jdbc :as jdbc] '[honey.sql :as sql])

(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))

(with-open [con (jdbc/get-connection ds)]
  ;; Raw DDL is allowed for HoneySQL (no model-driven schema).
  (jdbc/execute! con ["create table users(id integer primary key, name text, age integer)"])
  ;; Insert rows through the HoneySQL query builder.
  (doseq [[id nm ag] [[1 "alice" 30] [2 "bob" 25] [3 "carol" 35]]]
    (jdbc/execute! con (sql/format {:insert-into :users
                                    :columns [:id :name :age]
                                    :values [[id nm ag]]})))
  ;; Query all users ordered by id and print each name.
  (doseq [row (jdbc/execute! con (sql/format {:select :name
                                              :from :users
                                              :order-by [:id]}))]
    (println (val (first row)))))
