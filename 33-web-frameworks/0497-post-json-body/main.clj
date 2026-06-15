(require '[compojure.core :refer [defroutes POST]]
         '[ring.mock.request :as mock]
         '[cheshire.core :as json])

;; A Ring handler is just a fn: request-map -> response-map. This POST route
;; reads the raw JSON request body off the :body input stream, parses it with
;; Cheshire (keywordizing keys), sums the two numbers, and returns the result
;; as the response body.
(defroutes app
  (POST "/sum" {body :body}
    (let [{:keys [a b]} (json/parse-stream (clojure.java.io/reader body) true)]
      {:status 200
       :headers {"Content-Type" "text/plain"}
       :body (str (+ a b))})))

;; Exercise the route IN-PROCESS by calling the handler directly with a mock
;; request (no server, no fixed port). ring.mock.request/json-body sets the
;; JSON content type and an input stream :body just like a real request.
(let [req  (mock/json-body (mock/request :post "/sum") {:a 2 :b 3})
      resp (app req)]
  (println (:body resp)))
