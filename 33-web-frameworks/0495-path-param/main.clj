(require '[compojure.core :refer [defroutes GET]]
         '[ring.mock.request :as mock])

;; Compojure route with a path parameter :id, bound via destructuring.
;; The handler echoes the captured id back as the response body.
(defroutes app
  (GET "/users/:id" [id] id))

;; Exercise the route IN-PROCESS by calling the handler with a mock request.
(let [resp (app (mock/request :get "/users/42"))]
  (println (:body resp)))
