(require '[compojure.core :refer [defroutes GET]]
         '[ring.mock.request :as mock]
         '[ring.middleware.stacktrace :refer [wrap-stacktrace]])

;; The GET /boom handler throws a real exception when invoked.
(defroutes routes
  (GET "/boom" []
    (throw (ex-info "boom" {}))))

;; Wrap the routes with Ring's own error-handling middleware, wrap-stacktrace
;; (from ring-devel). It catches any exception thrown while handling the request
;; and produces a genuine 500 response itself — the status comes from the
;; framework layer, not from user code.
(def app (wrap-stacktrace routes))

;; Exercise the route IN-PROCESS by calling the handler directly with a mock
;; request (no server bound, no fixed port). The route really throws; Ring's
;; wrap-stacktrace turns that into a 500. Print the real status code.
(let [resp (app (mock/request :get "/boom"))]
  (println (:status resp)))
