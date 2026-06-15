(require '[compojure.core :refer [defroutes GET]]
         '[ring.mock.request :as mock])

;; Base Compojure route: GET / returns the plain body "hello".
(defroutes routes
  (GET "/" [] "hello"))

;; Ring middleware: a higher-order fn wrapping the handler. It calls the
;; inner handler, then transforms the response by prefixing its body.
;; The prefix is added here, NOT in the route handler.
(defn wrap-prefix [handler]
  (fn [request]
    (let [response (handler request)]
      (update response :body #(str "[mw] " %)))))

(def app (wrap-prefix routes))

;; Exercise the route IN-PROCESS: build a mock request and call the
;; wrapped handler directly (no server, no port). Print the response body.
(println (:body (app (mock/request :get "/"))))
