(require '[next.jdbc :as jdbc] '[honey.sql :as sql])

(def ds (jdbc/get-datasource {:jdbcUrl "jdbc:sqlite::memory:"}))

(with-open [con (jdbc/get-connection ds)]
  (jdbc/execute! con ["create table users(id integer primary key, name text)"])
  (jdbc/execute! con ["create table posts(id integer primary key, user_id integer, title text)"])
  (doseq [[id nm] [[1 "alice"] [2 "bob"]]]
    (jdbc/execute! con (sql/format {:insert-into :users :columns [:id :name] :values [[id nm]]})))
  (doseq [[id uid t] [[1 1 "hello"] [2 1 "world"] [3 2 "hi"]]]
    (jdbc/execute! con (sql/format {:insert-into :posts :columns [:id :user_id :title] :values [[id uid t]]})))
  (doseq [row (jdbc/execute! con (sql/format {:select [:users.name :posts.title]
                                              :from :posts
                                              :join [:users [:= :posts.user_id :users.id]]
                                              :order-by [:users.name :posts.title]}))]
    (println (str (:users/name row) " " (:posts/title row)))))
