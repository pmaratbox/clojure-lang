(require '[clojure.string :as str])

(def nums [3 1 2])

(println "asc:" (str/join " " (sort nums)))
(println "desc:" (str/join " " (sort > nums)))
