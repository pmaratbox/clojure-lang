(require '[compojure.core :refer [defroutes POST]]
         '[ring.mock.request :as mock])

;; A Ring handler is just a fn: request-map -> response-map. A response map can
;; carry any HTTP status code via the :status key. This POST route signals that
;; a resource was created by returning 201 (Created) instead of the default 200.
(defroutes app
  (POST "/create" []
    {:status 201
     :headers {"Content-Type" "text/plain"}
     :body "created"}))

;; Exercise the route IN-PROCESS by calling the handler directly with a mock
;; request (no server bound, no fixed port). We print the real status code that
;; the framework put on the response map, not a hardcoded value.
(let [resp (app (mock/request :post "/create"))]
  (println (:status resp)))
