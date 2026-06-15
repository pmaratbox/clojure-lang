(require '[next.jdbc :as jdbc])
(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))
(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table t(n integer)"])
  ;; first transaction: insert 1 and 2, then commit
  (.setAutoCommit con false)
  (jdbc/execute! con ["insert into t values(1)"])
  (jdbc/execute! con ["insert into t values(2)"])
  (.commit con)
  ;; second transaction: insert 3, then roll back
  (jdbc/execute! con ["insert into t values(3)"])
  (.rollback con)
  (.setAutoCommit con true)
  (doseq [row (jdbc/execute! con ["select n from t order by n"])]
    (println (val (first row)))))
