(require '[next.jdbc :as jdbc])

(with-open [con (jdbc/get-connection (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))]
  (jdbc/execute! con ["create table t(amount integer)"])
  (doseq [amount [10 20 30 40 50]]
    (jdbc/execute! con ["insert into t values(?)" amount]))
  (let [row (jdbc/execute-one!
              con
              ["select count(*),sum(amount),min(amount),max(amount) from t"])]
    (doseq [v (vals row)]
      (println v))))
