(require '[clojure.string :as str])

(def nums [10 20 30 40 50])

(println "slice:" (str/join " " (subvec nums 1 4)))
