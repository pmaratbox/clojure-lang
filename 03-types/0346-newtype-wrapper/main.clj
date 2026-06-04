(defrecord UserId [id])
(defrecord ProductId [id])

(println (str "user-" (:id (->UserId 1)))
         (str "prod-" (:id (->ProductId 2))))
