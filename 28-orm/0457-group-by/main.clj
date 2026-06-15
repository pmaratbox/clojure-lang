(require '[next.jdbc :as jdbc] '[honey.sql :as sql])

(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))

(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table products(id integer primary key, category text, price integer)"])
  (doseq [[id cat price] [[1 "a" 10] [2 "b" 20] [3 "a" 30]]]
    (jdbc/execute! con (sql/format {:insert-into :products
                                    :columns [:id :category :price]
                                    :values [[id cat price]]})))
  (doseq [row (jdbc/execute! con (sql/format {:select [:category [[:sum :price] :total]]
                                              :from :products
                                              :group-by [:category]
                                              :order-by [:category]}))]
    (println (val (first row)) (val (second row)))))
