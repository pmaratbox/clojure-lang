(require '[compojure.core :refer [defroutes GET]]
         '[compojure.route :as route]
         '[ring.mock.request :as mock])

;; Compojure routes: only "/" is defined; a route/not-found fallback turns
;; every unmatched path into a real 404 response from the framework.
(defroutes app
  (GET "/" [] "hello")
  (route/not-found "Not Found"))

;; Exercise an UNDEFINED route IN-PROCESS: build a mock GET /missing request and
;; call the handler fn directly, then print the real HTTP status code (404).
(let [resp (app (mock/request :get "/missing"))]
  (println (:status resp)))
