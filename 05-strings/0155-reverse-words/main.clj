(def text "hello world")
(def words (clojure.string/split text #" "))
(println (clojure.string/join " " (reverse words)))
