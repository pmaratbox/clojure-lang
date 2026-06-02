(def text "hello world")
(println (clojure.string/join " "
                              (map clojure.string/capitalize
                                   (clojure.string/split text #" "))))
