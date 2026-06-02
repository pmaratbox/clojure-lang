(def nested [[1 2] [3 4]])
(def flat (apply concat nested))

(println (clojure.string/join " " flat))
