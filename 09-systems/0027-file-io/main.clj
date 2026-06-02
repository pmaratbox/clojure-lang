(require '[clojure.java.io :as io])

(def path "greeting.txt")

(spit path "hello, file")
(def content (slurp path))
(io/delete-file path)

(println (str "read: " content))
