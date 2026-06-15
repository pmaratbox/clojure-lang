(require '[compojure.core :refer [defroutes GET]]
         '[ring.mock.request :as mock])

;; Compojure route: GET "/whoami" echoes the incoming request header X-Name.
;; Ring lower-cases header names into the request's :headers map.
(defroutes app
  (GET "/whoami" req
    (get-in req [:headers "x-name"])))

;; Exercise the handler IN-PROCESS: build a mock GET request, attach the
;; X-Name header, call the handler fn directly, then print the body from the
;; real HTTP response map. No server is started and no port is bound.
(let [resp (app (-> (mock/request :get "/whoami")
                    (mock/header "X-Name" "alice")))]
  (println (:body resp)))
