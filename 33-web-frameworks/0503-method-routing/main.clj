(require '[compojure.core :refer [defroutes GET POST]]
         '[ring.mock.request :as mock])

;; Compojure routes: same path /item, dispatched by HTTP method.
;;   GET  "/item" -> "get"
;;   POST "/item" -> "post"
(defroutes app
  (GET "/item" [] "get")
  (POST "/item" [] "post"))

;; Exercise the route IN-PROCESS: build a mock POST request for /item, call the
;; handler fn directly, and print the :body of the real response map. Compojure
;; routes by method, so POST selects the "post" handler. No port is bound.
(let [resp (app (mock/request :post "/item"))]
  (println (:body resp)))
