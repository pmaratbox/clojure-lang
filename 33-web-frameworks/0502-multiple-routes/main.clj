(require '[compojure.core :refer [defroutes GET]]
         '[ring.mock.request :as mock])

;; Compojure routes: two GET handlers registered on one router.
;;   GET "/"      -> "home"
;;   GET "/about" -> "about"
(defroutes app
  (GET "/" [] "home")
  (GET "/about" [] "about"))

;; Exercise both routes IN-PROCESS: build a mock request for each path and call
;; the handler fn directly, then print the :body from each real response map.
(doseq [path ["/" "/about"]]
  (let [resp (app (mock/request :get path))]
    (println (:body resp))))
