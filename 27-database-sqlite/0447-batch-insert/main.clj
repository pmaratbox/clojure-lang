(require '[next.jdbc :as jdbc]
         '[next.jdbc.prepare :as p])

(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))

(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table t(n integer)"])
  (jdbc/with-transaction [tx con]
    (with-open [ps (jdbc/prepare tx ["insert into t values(?)"])]
      (p/execute-batch! ps (map vector (range 1 1001)))))
  (let [row (jdbc/execute-one! con ["select count(*) from t"])]
    (println (val (first row)))))
