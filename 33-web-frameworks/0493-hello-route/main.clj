(require '[compojure.core :refer [defroutes GET]]
         '[ring.mock.request :as mock])

;; Compojure route: GET "/" returns the literal text "hello".
(defroutes app
  (GET "/" [] "hello"))

;; Exercise the handler IN-PROCESS: build a mock GET request and call the
;; handler fn directly, then print the body from the real HTTP response map.
(let [resp (app (mock/request :get "/"))]
  (println (:body resp)))
