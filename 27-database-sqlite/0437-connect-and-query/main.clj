(require '[next.jdbc :as jdbc])

(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))

(with-open [con (jdbc/get-connection ds)]
  (let [row (first (jdbc/execute! con ["select 42"]))]
    (println (val (first row)))))
