(require '[compojure.core :refer [defroutes GET]]
         '[ring.mock.request :as mock]
         '[cheshire.core :as json])

;; A Ring handler is just a fn: request-map -> response-map. Compojure's GET
;; matches the route and returns a response whose :body is a JSON string built
;; by Cheshire, with the JSON content type set explicitly.
(defroutes app
  (GET "/user" []
    {:status 200
     :headers {"Content-Type" "application/json"}
     :body (json/generate-string {:name "alice"})}))

;; Exercise the route IN-PROCESS by calling the handler directly with a mock
;; request (no server, no fixed port). Print only the response body.
(let [resp (app (mock/request :get "/user"))]
  (println (:body resp)))
