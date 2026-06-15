(require '[compojure.core :refer [defroutes GET]]
         '[ring.middleware.params :refer [wrap-params]]
         '[ring.mock.request :as mock])

;; Compojure route GET /greet that reads the "name" query-string parameter.
;; ring's wrap-params middleware parses the query string into :params, and the
;; handler returns "hello " + the value.
(defroutes routes
  (GET "/greet" {params :params}
    (str "hello " (get params "name"))))

(def app (wrap-params routes))

;; Exercise the route IN-PROCESS by calling the handler with a mock request
;; carrying a query string (no port is bound). Print the response :body.
(let [resp (app (mock/request :get "/greet" {"name" "alice"}))]
  (println (:body resp)))
