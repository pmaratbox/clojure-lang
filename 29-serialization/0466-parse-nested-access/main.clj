(require '[cheshire.core :as json])

;; The JSON to parse: an object holding a nested user object whose value
;; contains a name string and a roles array.
(def input "{\"user\":{\"name\":\"alice\",\"roles\":[\"admin\",\"user\"]}}")

;; Parse into a Clojure data tree. Passing `true` turns the string keys into
;; keywords so we can navigate the nested structure with keyword access.
(def parsed (json/parse-string input true))

;; Read a deeply nested value (user.name) and the first element of the roles
;; array using ordinary Clojure tree navigation on the parsed result.
(let [name       (get-in parsed [:user :name])
      first-role (first (get-in parsed [:user :roles]))]
  (println (str name " " first-role)))
